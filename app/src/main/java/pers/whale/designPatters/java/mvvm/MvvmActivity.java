package pers.whale.designPatters.java.mvvm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import pers.whale.designPatters.R;
import pers.whale.designPatters.databinding.ActivityMvvmBinding;

/**
 * Created by whale on 2019-10-04 16:52
 */
public class MvvmActivity extends AppCompatActivity {

    private Button button;

    private ActivityMvvmBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        UserInfo userInfo = new UserInfo();
        binding.setUser(userInfo);
    }

}
