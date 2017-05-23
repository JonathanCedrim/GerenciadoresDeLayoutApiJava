package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/16/17.
 */

public class ImgButtonActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_image);

        ImageButton btn_img = (ImageButton) findViewById(R.id.img_btn);

        btn_img.setOnClickListener(onClickImgButton());

        RadioGroup group = (RadioGroup) findViewById(R.id.group_img_btn);
        group.setOnCheckedChangeListener(onClickCheckedListener());
    }

    private View.OnClickListener onClickImgButton() {
        return new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ola noob", Toast.LENGTH_SHORT).show();
            }
        };
    }

    private RadioGroup.OnCheckedChangeListener onClickCheckedListener() {
        return new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                boolean on = R.id.rd_btn_on_img_btn == checkedId;
                boolean off = R.id.rd_btn_off_img_btn == checkedId;

                if(on){
                    Toast.makeText(getApplicationContext(), "just do it", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "seu noob", Toast.LENGTH_SHORT).show();
                }
            }
        };
    }
}
