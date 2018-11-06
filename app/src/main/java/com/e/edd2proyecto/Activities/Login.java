package com.e.edd2proyecto.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.e.edd2proyecto.R;

public class Login extends AppCompatActivity {

    Button btnSignUp, btnLogin;
    EditText etUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chat = new Intent(Login.this, ChatActivity.class);
                startActivity(chat);
            }
        });

        btnSignUp = findViewById(R.id.btnRegister);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUp = new Intent(Login.this, SignUpActivity.class);
                startActivity(signUp);
            }
        });
    }

    public void Login() {

    }

}
