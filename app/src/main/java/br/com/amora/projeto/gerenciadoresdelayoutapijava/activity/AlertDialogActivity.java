package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/25/17.
 */

public class AlertDialogActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        Button btn_alert_dialog_button = (Button) findViewById(R.id.btn_alert_dialog_button);
        btn_alert_dialog_button.setOnClickListener(onClickAlertDialog());


    }

    private View.OnClickListener onClickAlertDialog() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                 new AlertDialog.Builder(getContext()).setIcon(R.drawable.hxh).setTitle("The Best Anime").setMessage("Qual o melhor anime?").setPositiveButton("HxH", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ToastAnime(R.drawable.hxh);
                    }
                }).setNegativeButton("YuYuHakusho", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ToastAnime(R.drawable.yuyu);
                    }
                }).create().show();

            }
        };
    }

    private void ToastAnime(int caminho) {
        ImageView img = new ImageView(getContext());
        Toast toast = new Toast(getContext());
        img.setImageResource(caminho);
        toast.setView(img);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }

    private Context getContext() {
        return this;
    }
}
