package pers.whale.designPatters;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import pers.whale.designPatters.java.mvc.MvcActivity;

/**
 * Created by whale on 2019-10-04 15:01
 */
public class MainActivity extends AppCompatActivity {

    private TextView tvMvc;
    private TextView tvMvp;
    private TextView tvMvvm;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        tvMvc = findViewById(R.id.tvMvc);
        tvMvp = findViewById(R.id.tvMvp);
        tvMvvm = findViewById(R.id.tvMvvm);

        tvMvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MvcActivity.actionStart(MainActivity.this);
            }
        });
    }
}
