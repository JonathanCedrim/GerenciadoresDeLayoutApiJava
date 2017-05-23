package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/11/17.
 */

//><
/*Trocar por FrameLayout*/
public class InflateActivity extends AppCompatActivity{
    int i = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inflate);

        Button btn_inflate = (Button) findViewById(R.id.btn_inflate);

        btn_inflate.setOnClickListener(onClickInflate());
      }

    private View.OnClickListener onClickInflate() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertButton();
                onRestart();
            }
        };
    }

    private void insertButton(){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_inflate);
                LayoutInflater inflater = LayoutInflater.from(getApplicationContext());

                TextView txtInflate = (TextView) inflater.inflate(R.layout.inflater_txt, linearLayout, false);
                txtInflate.setText("ola noob: " + i);

                linearLayout.addView(txtInflate);
            }
        });
    }
}
