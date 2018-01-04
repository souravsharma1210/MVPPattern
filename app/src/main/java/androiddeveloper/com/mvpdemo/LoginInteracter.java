package androiddeveloper.com.mvpdemo;

/**
 * Created by sourav sharma on 02-01-2018.
 */

public interface LoginInteracter {
    interface ShowErrorMessage
    {
        void userNameError();
        void passwordError();
        void success();
    }
    void validateCredential(String name,String password, LoginPresenterImp loginPresenter);
}
