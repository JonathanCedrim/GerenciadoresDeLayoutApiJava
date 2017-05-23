package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/9/17.
 */

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout_list);

        for (int i = 0; i< 5000; i++){
            TextView textView = new TextView(this);

            textView.setText("ola: " + i);
            textView.setLayoutParams(new LinearLayoutCompat.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));

            linearLayout.addView(textView);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}