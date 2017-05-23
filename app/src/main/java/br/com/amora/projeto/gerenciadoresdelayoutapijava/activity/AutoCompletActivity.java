package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/11/17.
 */

public class AutoCompletActivity extends AppCompatActivity {
    private static final String[] ESTADOS = new String[]{"acre", "Alagoas", "Amapa",
         "Amazonas", "Bahia", "Ceara", "São Paulo", "Santa Catarina", "Sergipe", "Tocantins"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        AutoCompleteTextView estados = (AutoCompleteTextView)
                findViewById(R.id.auto_complet_auto_complet_estados);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, ESTADOS);

        estados.setAdapter(adapter);
    }
}
