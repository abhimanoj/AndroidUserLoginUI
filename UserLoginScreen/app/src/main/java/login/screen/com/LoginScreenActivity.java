package login.screen.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by Abhimanoj on 11/3/17.
 */

public class LoginScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        //Hide Action Bar
        getSupportActionBar().hide();

    }

 public void isValidUser(View view) {

        //Your Code
    }
}
