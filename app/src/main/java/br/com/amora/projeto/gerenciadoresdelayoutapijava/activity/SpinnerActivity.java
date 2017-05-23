package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/16/17.
 */

public class SpinnerActivity extends AppCompatActivity{

    private int[] imagens = {R.drawable.hxh, R.drawable.yuyu};
    private String[] titulos = {"hunter x hunter", "yu yu hakusho"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


        final Spinner box = (Spinner) findViewById(R.id.spinner_spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, titulos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        box.setAdapter(adapter);

        box.setOnItemSelectedListener(onSelectSpinner());

    }

    private AdapterView.OnItemSelectedListener onSelectSpinner() {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final ImageView imagem = (ImageView) findViewById(R.id.img_view_spinner_anime);
                imagem.setImageResource(imagens[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
    }
}
