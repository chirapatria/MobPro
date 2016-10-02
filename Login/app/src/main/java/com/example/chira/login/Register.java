package com.example.chira.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by chira on 01/10/16.
 */
public class Register extends AppCompatActivity {
    Button cancel, save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        cancel = (Button) findViewById(R.id.buttonCancel);
        save = (Button) findViewById(R.id.buttonSave);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Icancel = new Intent(Register.this, MainActivity.class);
                startActivity(Icancel);
            }
        });
    }

}
