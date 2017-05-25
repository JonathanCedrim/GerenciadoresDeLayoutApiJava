package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/16/17.
 */

public class DialogActivity extends AppCompatActivity {
    private static final String URL = "http://livroandroid.com.br/imgs/livro_android.png";
    private ProgressDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        dialog = ProgressDialog.show(this, "Carregando", "Buscando...", false, true);

        new Thread(() -> {
            try {
                URL url = new URL(URL);
                InputStream in = url.openStream();
                final Bitmap img = BitmapFactory.decodeStream(in);
                in.close();

                runOnUiThread(() -> {
                        dialog.dismiss();
                        ImageView imgView = (ImageView) findViewById(R.id.img_dialog);
                        imgView.setImageBitmap(img);
                });

            } catch (IOException e) {
                Log.e("erro ao baixar imagem: ", e.getMessage(), e);
            }
        }).start();


    }
}

