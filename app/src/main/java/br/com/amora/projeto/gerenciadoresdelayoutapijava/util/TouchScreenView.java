package br.com.amora.projeto.gerenciadoresdelayoutapijava.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 6/1/17.
 */

public class TouchScreenView extends View {
    private static final String TAG = "touch";
    int x, y;
    private Drawable img;
    private boolean selecionou;
    private int larguraTela;
    private int larguraImg;
    private int alturaTela;
    private int alturaImg;


    public TouchScreenView(Context context) {
        super(context, null);

        img = context.getResources().getDrawable(R.drawable.megaman);
        larguraImg = img.getIntrinsicWidth();
        alturaImg = img.getIntrinsicHeight();
        setFocusable(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        this.larguraTela = w;
        this.alturaTela = h;

        x = w / 2 - (larguraImg / 2);
        y = h / 2 - (alturaImg / 2);

        Log.i(TAG, "onSizeChanged x/y: " + x + "/" + y);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint pincel = new Paint();
        pincel.setColor(Color.WHITE);

        canvas.drawRect(0, 0, larguraTela, alturaTela, pincel);

        img.setBounds(x, y, x + larguraImg, y + alturaImg);

        img.draw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        Log.i(TAG, "onTouchEvent: x/y > " + x + "/" + y);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                selecionou = img.copyBounds().contains((int) x, (int) y);

                break;

            case MotionEvent.ACTION_MOVE:

                if (selecionou) {
                    this.x = (int) x - (larguraImg / 2);
                    this.y = (int) y - (larguraImg / 2);
                }
                break;

            case MotionEvent.ACTION_UP:
                selecionou = false;
                break;
        }
        invalidate();
        return true;
    }
}
