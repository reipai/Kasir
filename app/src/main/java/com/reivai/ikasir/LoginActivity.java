package com.reivai.ikasir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, pin;
    TextView regist, lostpin;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.et_username);
        pin = (EditText) findViewById(R.id.et_pin);
        login = (Button) findViewById(R.id.btn_login);
        lostpin = (TextView) findViewById(R.id.tv_lostpin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = username.getText().toString();
                String pass = pin.getText().toString();

                if(uname.equals("reivai") && pass.equals("12345")) {
                    Intent i = new Intent(LoginActivity.this, LandingPage.class);
                    startActivity(i);
                    finish();
                } else if(uname.matches("") || pass.matches("")) {
                    Toast.makeText(getApplication(), "Username atau PIN tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplication(), "Username atau PIN salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
