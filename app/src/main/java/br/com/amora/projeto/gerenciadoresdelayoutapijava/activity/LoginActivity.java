package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/9/17.
 */

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        Button btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(onClickLogin());
    }

    private View.OnClickListener onClickLogin() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edt_name = (EditText) findViewById(R.id.edt_login_name);
                String name = edt_name.getText().toString();

                //if(name.equals("j")) {


                    Intent intent = new Intent(getContext(), MainActivity.class);
                    Bundle bundle = new Bundle();

                    bundle.putString("name", name);
                    intent.putExtras(bundle);

                    startActivity(intent);
                //}
            }
        };
    }

    private Context getContext(){
        return this;
    }
}