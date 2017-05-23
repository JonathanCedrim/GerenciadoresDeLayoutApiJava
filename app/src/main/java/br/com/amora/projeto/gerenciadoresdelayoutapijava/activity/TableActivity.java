package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/9/17.
 */

public class TableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Button btn_table_submit = (Button) findViewById(R.id.btn_table_submit);
        Button btn_table_cancel = (Button) findViewById(R.id.btn_table_cancel);

        btn_table_submit.setOnClickListener(onClickSubmit());
        btn_table_cancel.setOnClickListener(onClickCancel());

    }

    private View.OnClickListener onClickSubmit() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert("salvando...");
                alert("salvo!");
            }
        };
    }

    private View.OnClickListener onClickCancel() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };
    }

    private void alert(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
