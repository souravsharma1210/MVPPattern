package androiddeveloper.com.mvpdemo;


import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;

/**
 * Created by sourav sharma on 02-01-2018.
 */

public class LoginInteracterImp implements LoginInteracter
{
    private static final String DEBUG_TAG = LoginInteracter.class.getSimpleName();

    @Override
    public void validateCredential(final String name, final String password, final LoginPresenterImp loginPresenter) {
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Log.d(DEBUG_TAG,(name).length()+"");
            if(name==null ||(name).length()==0)
            {
                loginPresenter.userNameError();
            }
            else if(password==null ||(password).length()==0)
            {
                loginPresenter.passwordError();
            }
            else
            {
                loginPresenter.success();
            }
        }
    },1000);
    }
}
