package pers.whale.designPatters.java.mvp;

/**
 * Created by whale on 2019-10-04 16:17
 */
public class MvpPresenter implements MvpContract.Presenter {

    public MvpContract.View view;

    public MvpContract.Model model;

    public MvpPresenter(MvpContract.View view){
        this.view = view;
        model = new MvpModel(this);
    }

    @Override
    public void getInfo() {
        model.getInfo();//到model层获取数据
    }

    @Override
    public void getInfoSuc() {
        // 获取成功，通知view层
        view.getInfoSuc();
    }

    @Override
    public void getInfoFail() {
        //获取失败，通知view
        view.getInfoFail();
    }
}
