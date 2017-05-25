package br.com.amora.projeto.gerenciadoresdelayoutapijava.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.amora.projeto.gerenciadoresdelayoutapijava.R;

/**
 * Created by cedrim on 5/9/17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();


        final Context context = this;

        Button btn_table = (Button) findViewById(R.id.btn_main_table);
        Button btn_list = (Button) findViewById(R.id.btn_main_list);
        Button btn_listAPIJava = (Button) findViewById(R.id.btn_main_listAPIJava);
        Button btn_inflate = (Button) findViewById(R.id.btn_main_inflate);
        Button btn_auto_complet = (Button) findViewById(R.id.btn_main_auto_complet);
        Button btn_img_button = (Button) findViewById(R.id.btn_main_img_button);
        Button btn_spinner_button = (Button) findViewById(R.id.btn_main_spinner_button);
        Button btn_dialog_button = (Button)  findViewById(R.id.btn_main_dialog_button);
        Button btn_progress_bar = (Button) findViewById(R.id.btn_main_progress_bar_button);
        Button btn_toast = (Button) findViewById(R.id.btn_main_toast_button);
        Button btn_alert_dialog = (Button) findViewById(R.id.btn_main_alert_dialog_button);

        btn_table.setOnClickListener(onClickTable(context));
        btn_list.setOnClickListener(onClickList(context));
        btn_listAPIJava.setOnClickListener(onClickListAPIJava());
        btn_inflate.setOnClickListener(onClickInflate());
        btn_auto_complet.setOnClickListener(onClickAutoComplet());
        btn_img_button.setOnClickListener(onClickImgButton());
        btn_spinner_button.setOnClickListener(onClickSpinner());
        btn_dialog_button.setOnClickListener(onClickDialog());
        btn_progress_bar.setOnClickListener(onClickProgressBar());
        btn_toast.setOnClickListener(onClickToast());
        btn_alert_dialog.setOnClickListener(onClickAlertDialog());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(onClickSearchView());

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        long id = item.getItemId();
        if(id == R.id.action_refresh){
            alert("atualizando");
        }

        if(id == R.id.action_share){
            ShareActionProvider share = (ShareActionProvider) MenuItemCompat.getActionProvider(item);
            share.setShareIntent(getDefaultIntent());
        }

        if(id == R.id.menu_setting){

        }
        return onOptionsItemSelected(item);
    }

    private Intent getDefaultIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");
        intent.putExtra(Intent.EXTRA_TEXT, "Compartilha ae");

        return intent;
    }

    private View.OnClickListener onClickListAPIJava() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LinearLayoutAPIJavaActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener onClickTable(final Context context) {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, TableActivity.class));
            }
        };
    }

    private View.OnClickListener onClickList(final Context context) {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, ListActivity.class));
            }
        };
    }

    private View.OnClickListener onClickInflate() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InflateActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener onClickAutoComplet() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AutoCompletActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener onClickImgButton() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ImgButtonActivity.class);
                startActivity(intent);
            }
        };
    }

    private SearchView.OnQueryTextListener onClickSearchView() {
        return new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                alert(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                alert(newText);
                return false;
            }
        };
    }

    private View.OnClickListener onClickSpinner() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SpinnerActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener onClickDialog() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DialogActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener onClickProgressBar() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProgressBarActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener onClickToast() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ToastActivity.class);
                startActivity(intent);
            }
        };
    }

    private View.OnClickListener onClickAlertDialog() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AlertDialogActivity.class);
                startActivity(intent);
            }
        };
    }

    private void alert(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    private Context getContext(){
        return this;
    }
}