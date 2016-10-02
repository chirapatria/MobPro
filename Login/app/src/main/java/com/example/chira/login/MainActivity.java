package com.example.chira.login;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login, register, fb, google, tw;
    EditText username, pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.buttonLogin);
        register = (Button) findViewById(R.id.buttonRegist);
        fb = (Button) findViewById(R.id.buttonFb);
        google = (Button) findViewById(R.id.buttonGp);
        tw = (Button) findViewById(R.id.buttonTw);
        username = (EditText) findViewById(R.id.editUN);
        pw = (EditText) findViewById(R.id.editPW);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri facebook = Uri.parse("http://www.facebook.com");
                Intent fb = new Intent(Intent.ACTION_VIEW, facebook);
                startActivity(fb);
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gp = Uri.parse("http://plus.google.com");
                Intent google = new Intent(Intent.ACTION_VIEW, gp);
                startActivity(google);
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri twitter = Uri.parse("http://twitter.com");
                Intent tw = new Intent(Intent.ACTION_VIEW, twitter);
                startActivity(tw);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regist = new Intent(MainActivity.this, Register.class);
                startActivity(regist);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin")&& pw.toString().equals("1234"));
                Intent Ilogin = new Intent(MainActivity.this, Login.class);
                startActivity(Ilogin);
            }


        });
    }
}
