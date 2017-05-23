package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/23/17.
 */

public class ProgressBarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        Button button = (Button) findViewById(R.id.btn_progress_bar_button);
        button.setOnClickListener(onClickSimularProgresso());
    }

    private View.OnClickListener onClickSimularProgresso() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);

                new Thread(() -> {
                    for (int i = 0; i <= 100; i++) {
                        final int progress = i;

                        runOnUiThread(() -> {

                            progressBar.setProgress(progress);
                        });
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            throw new RuntimeException("erro ao fazer a Thread dormir: " + e);
                        }
                    }
                }).start();
            }
        };
    }
}
