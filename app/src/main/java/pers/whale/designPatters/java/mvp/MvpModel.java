package pers.whale.designPatters.java.mvp;

/**
 * 在这里请求网络或数据库获取数据
 * Created by whale on 2019-10-04 16:17
 */
public class MvpModel implements MvpContract.Model {

    public MvpContract.Presenter presenter;

    public MvpModel(MvpContract.Presenter presenter){
        this.presenter  =presenter;
    }

    @Override
    public void getInfo() {
        /***成功****/
        presenter.getInfoSuc();
        /****失败****/
        presenter.getInfoFail();
    }
}
