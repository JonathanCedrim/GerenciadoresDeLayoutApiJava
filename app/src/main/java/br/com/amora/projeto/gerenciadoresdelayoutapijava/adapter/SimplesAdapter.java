package br.com.amora.projeto.gerenciadoresdelayoutapijava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/30/17.
 */

public class SimplesAdapter extends BaseAdapter {
    private final Context context;
    private String[] planetas = new String[]{"Mercúrio", "Vênus", "planeta_03_terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão"};

    public SimplesAdapter(Context context) {
        super();
        this.context = context;
    }

    @Override
    public int getCount() {
        return planetas.length;
    }

    @Override
    public Object getItem(int position) {
        return planetas[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.inflater_txt, parent, false);
        TextView txt_view = (TextView) view.findViewById(R.id.txt_inflater);
        txt_view.setText(planetas[position]);

        return txt_view;
    }
}