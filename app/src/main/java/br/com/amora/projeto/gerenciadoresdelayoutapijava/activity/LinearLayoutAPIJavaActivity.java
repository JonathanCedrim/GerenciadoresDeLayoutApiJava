package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by cedrim on 5/11/17.
 */

public class LinearLayoutAPIJavaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayoutCompat layout = new LinearLayoutCompat(this);
        layout.setOrientation(LinearLayoutCompat.VERTICAL);
        layout.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        layout.setPadding(10, 10, 10, 10);

        TextView nome = new TextView(this);
        nome.setText("Nome: ");
        nome.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        EditText edt_nome = new EditText(this);
        edt_nome.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView txt_senha = new TextView(this);
        txt_senha.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        EditText edt_senha = new EditText(this);
        edt_senha.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        LinearLayoutCompat linearAlinhado = new LinearLayoutCompat(this);
        linearAlinhado.setOrientation(LinearLayoutCompat.HORIZONTAL);
        linearAlinhado.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearAlinhado.setGravity(Gravity.CENTER_HORIZONTAL);

        Button submit = new Button(this);
        submit.setText("submit");
        submit.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        Button cancel = new Button(this);
        cancel.setText("cancel");
        cancel.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));


        submit.setOnClickListener(onClickSubmit());
        cancel.setOnClickListener(onClickCancel());

        layout.addView(nome);
        layout.addView(edt_nome);
        edt_nome.requestFocus();
        layout.addView(txt_senha);
        layout.addView(edt_senha);
        layout.addView(linearAlinhado);
        linearAlinhado.addView(submit);
        linearAlinhado.addView(cancel);

        setContentView(layout);
    }

    private View.OnClickListener onClickCancel() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };
    }

    private View.OnClickListener onClickSubmit() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "enviando...", Toast.LENGTH_SHORT).show();
            }
        };
    }
}