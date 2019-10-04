package pers.whale.designPatters.java.mvc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import pers.whale.designPatters.R;

public class MvcActivity extends AppCompatActivity {

    private SampleModel sampleModel = new SampleModel();
    Button button;
    TextView tvAge;
    TextView tvName;

    public static void actionStart(Context context){
        Intent intent =new Intent(context,MvcActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        initView();
    }

    private void initView(){
        button = findViewById(R.id.btnGetInfo);
        tvAge  =findViewById(R.id.tvAge);
        tvName  = findViewById(R.id.tvName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sampleModel.getUserInfo(12, "jy", new CallBack<SampleModel.UserInfo>() {
                    @Override
                    public void onCallBack(SampleModel.UserInfo userInfo) {
                        tvAge.setText(""+userInfo.getAge());//此处若直接传int会导致被当做resourceID使用
                        tvName.setText(userInfo.getName());
                    }
                });
            }
        });
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        sampleModel.onDestroy();
    }
}
