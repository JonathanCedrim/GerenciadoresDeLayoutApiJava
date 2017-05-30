package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;
import br.com.amora.projeto.gerenciadoresdelayoutapijava.adapter.SimplesAdapter;

/**
 * Created by cedrim on 5/30/17.
 */

public class ListViewActivity extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = (ListView) findViewById(R.id.list_view_list_view);
        listView.setAdapter(new SimplesAdapter(this));
        listView.setOnItemClickListener(onClickItem());
    }

    private AdapterView.OnItemClickListener onClickItem() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = (String) parent.getAdapter().getItem(position);
                Toast.makeText(getApplicationContext(), "Texto selecionado: " + text + ", posição: " + position, Toast.LENGTH_SHORT).show();
            }
        };
    }
}