package androiddeveloper.com.mvpdemo;

/**
 * Created by sourav sharma on 02-01-2018.
 */

public class LoginPresenterImp implements LoginPresenter,LoginInteracter.ShowErrorMessage {
    private LoginView loginView;
    private LoginInteracter loginInteracter;
    public LoginPresenterImp(LoginView loginView,LoginInteracter loginInteracter)
    {
        this.loginView=loginView;
        this.loginInteracter=loginInteracter;

    }
    @Override
    public void login(String userName,String password)
    {
        if(loginView!=null)
        {
            loginView.showProgressBar();
        }
     loginInteracter.validateCredential(userName,password,this);
    }

    @Override
    public void userNameError() {
        loginView.showErrorMessage("userName is wrong");

    }

    @Override
    public void passwordError() {
        loginView.showErrorMessage("Password is wrong");
    }

    @Override
    public void success() {
        loginView.showErrorMessage("Success");
    }

}
