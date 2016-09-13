package com.example.luisg.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tuUser, tuPass;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String usuario = getIntent().getStringExtra("USER");
        String contraseña = getIntent().getStringExtra("PASS");


        tuUser=(TextView)findViewById(R.id.respUser);
        tuPass=(TextView)findViewById(R.id.respPass);

        tuUser.setText("Tu username es: "+usuario);
        tuPass.setText("Tu contraseña es: "+contraseña);

        boton = (Button) findViewById(R.id.button2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzar(v);
            }
        });




    }

    public void lanzar(View view) {
        finish();
        Intent i = new Intent(this, Login.class );
        startActivity(i);
    }
}
