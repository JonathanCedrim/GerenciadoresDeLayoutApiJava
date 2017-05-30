package br.com.amora.projeto.gerenciadoresdelayoutapijava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 6/1/17.
 */

public class PlanetaAdapter extends BaseAdapter {
    private final Context context;
    private final List<Planeta> planetas;

    public PlanetaAdapter(Context context, List<Planeta> planetas) {
        this.context = context;
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas != null ? planetas.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return planetas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.adapter_planeta, parent, false);
        TextView txt_nome_planeta = (TextView) view.findViewById(R.id.txt_adapter_planeta_txt_nome_planeta);
        ImageView img_planeta = (ImageView) view.findViewById(R.id.img_adapter_planeta_img_planeta);

        Planeta planeta = planetas.get(position);
        txt_nome_planeta.setText(planeta.nome);
        img_planeta.setImageResource(planeta.img);

        return view;
    }
}
