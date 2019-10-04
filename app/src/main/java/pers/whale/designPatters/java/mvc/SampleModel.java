package pers.whale.designPatters.java.mvc;

/**
 * Created by whale on 2019-10-04 14:17
 */
public class SampleModel implements BaseModel {

    public void getUserInfo(int age, String name, CallBack<UserInfo> callBack1){
        UserInfo userInfo = new UserInfo(age,name);
        callBack1.onCallBack(userInfo);

    }

    @Override
    public void onDestroy() {
        //执行Model销毁资源操作
    }

    public class UserInfo
    {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public UserInfo(int age,String name){
            this.age = age;
            this.name = name;
        }


        public String getName() {
            return name;
        }


    }

}
