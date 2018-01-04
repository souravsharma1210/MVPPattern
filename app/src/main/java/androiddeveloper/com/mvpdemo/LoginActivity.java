package androiddeveloper.com.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private ProgressBar progressBar;
    private TextView errorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LoginPresenter loginPresenter=new LoginPresenterImp(this,new LoginInteracterImp());
        Button login=findViewById(R.id.login);
        final EditText userNameText=(EditText)findViewById(R.id.user_name);
        final EditText passwordText=(EditText)findViewById(R.id.password);
        progressBar=(ProgressBar)findViewById(R.id.progress);
        errorMessage=(TextView)findViewById(R.id.errorMessage);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.login(userNameText.getText().toString(),passwordText.getText().toString());
            }
        });
    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showErrorMessage(String message) {
        errorMessage.setVisibility(View.VISIBLE);
        errorMessage.setText(message);
        hideProgressBar();
    }
}
