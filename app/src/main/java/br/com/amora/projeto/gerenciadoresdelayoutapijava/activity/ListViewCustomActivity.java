package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;
import br.com.amora.projeto.gerenciadoresdelayoutapijava.adapter.Planeta;
import br.com.amora.projeto.gerenciadoresdelayoutapijava.adapter.PlanetaAdapter;

/**
 * Created by cedrim on 5/31/17.
 */

public class ListViewCustomActivity extends BaseActivity {
    private List<Planeta> planetas = Planeta.getPlanetas();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_custom);

        ListView listView = (ListView) findViewById(R.id.list_view_list_view_custom);

        listView.setAdapter(new PlanetaAdapter(this, planetas));
        listView.setOnItemClickListener(onClickItem());
    }

    private AdapterView.OnItemClickListener onClickItem() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Planeta planeta = planetas.get(position);
                ImageView img_view_custom_img_top = (ImageView) findViewById(R.id.img_list_view_custom_img_topo);
                img_view_custom_img_top.setImageResource(planeta.img);
                Toast.makeText(getApplicationContext(), "Planeta: " + planeta.nome, Toast.LENGTH_SHORT).show();
            }
        };
    }
}
