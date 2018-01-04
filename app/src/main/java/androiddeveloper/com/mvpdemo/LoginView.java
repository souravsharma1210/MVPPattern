package androiddeveloper.com.mvpdemo;

/**
 * Created by sourav sharma on 02-01-2018.
 */

public interface LoginView {
    void showProgressBar();
    void hideProgressBar();
    void showErrorMessage(String message);
}
