package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.util.TouchScreenView;

/**
 * Created by cedrim on 6/1/17.
 */

public class TouchScreenViewActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TouchScreenView(this));
    }
}
