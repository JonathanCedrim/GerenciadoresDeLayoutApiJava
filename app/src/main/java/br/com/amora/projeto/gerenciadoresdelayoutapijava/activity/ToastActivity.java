package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/25/17.
 */

public class ToastActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        Button btn_toast_button = (Button) findViewById(R.id.btn_toast_button);
        btn_toast_button.setOnClickListener(onClickToast());
    }

    private View.OnClickListener onClickToast() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img = new ImageView(getContext());
                img.setImageResource(R.drawable.hxh);
                Toast toast = new Toast(getContext());
                toast.setView(img);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        };
    }

    private Context getContext(){
        return this;
    }
}
