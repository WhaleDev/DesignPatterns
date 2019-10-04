package pers.whale.designPatters.java.mvvm;

/**
 * Created by whale on 2019-10-04 17:21
 */
public class Model {
    private int age = 10;
    private String name  ="jy";

    public void add(ModelCallback callback) {
        callback.onSuccess(++age,name);//通知Presenter结果
    }

    public interface ModelCallback {//数据回调接口
        void onSuccess(int num,String name);

        void onFailed(String text);
    }

}
