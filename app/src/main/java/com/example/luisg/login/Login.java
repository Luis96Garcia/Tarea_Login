package com.example.luisg.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
    private EditText username,password;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
        boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarActivity(v, username.getText().toString(), password.getText().toString());
            }
        });


    }

    public void lanzarActivity(View v, String user, String pass) {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("USER", user);
        i.putExtra("PASS", pass);
        startActivity(i);
    }
}
