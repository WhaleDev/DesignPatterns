package pers.whale.designPatters.java.mvp;

/**
 * Created by whale on 2019-10-04 16:09
 */
public interface MvpContract {

    interface View{
        void getInfo();

        void getInfoSuc();

        void getInfoFail();

    }

    interface  Presenter{
        void getInfo();

        void getInfoSuc();

        void getInfoFail();
    }

    interface Model{
        void getInfo();
    }
}
