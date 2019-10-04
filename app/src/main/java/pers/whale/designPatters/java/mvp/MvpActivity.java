package pers.whale.designPatters.java.mvp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import pers.whale.designPatters.R;

/**
 * View层，只负责展示数据，展示各种情况下的数据
 * Created by whale on 2019-10-04 16:14
 */
public class MvpActivity extends AppCompatActivity implements MvpContract.View {

    public MvpContract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
    }

    @Override
    public void getInfo() {
        presenter = new MvpPresenter(this);
        presenter.getInfo();

    }

    @Override
    public void getInfoSuc() {
        //展示成功数据
    }

    @Override
    public void getInfoFail() {
        //展示失败结果
    }
}
