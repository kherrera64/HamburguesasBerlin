package com.berlin.hamburguesasberlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

import com.facebook.AccessToken;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(AccessToken.getCurrentAccessToken() == null)
        {
            goLogInScreen();
        }
    }


    private void goLogInScreen() {
        Intent intent = new Intent(this, LogInActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void Logout(View view) {
       LoginManager.getInstance().logOut();
        goLogInScreen();
    }
}
