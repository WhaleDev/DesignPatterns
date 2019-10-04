package pers.whale.designPatters.java.mvvm;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * Created by whale on 2019-10-04 16:45
 */
public class UserInfo extends BaseObservable {

    private int age;
    private String name;
    private final  Model model;

    public UserInfo(){
        model = new Model();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
   @Bindable
    public int getAge() {
        return age;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void onClick(View view){
        model.add(new Model.ModelCallback() {
            @Override
            public void onSuccess(int age,String name) {
                 setAge(age);
                 setName(name);
            }

            @Override
            public void onFailed(String text) {

            }
        });
    }


}
