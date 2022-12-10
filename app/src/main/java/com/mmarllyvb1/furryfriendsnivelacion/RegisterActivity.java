package com.mmarllyvb1.furryfriendsnivelacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class RegisterActivity extends AppCompatActivity {

    CircleImageView circeImageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        circeImageBack=findViewById(R.id.circleImageBack);

        circeImageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {finish();}
        });
    }

    public void registrarse (View view){
        Intent registrar = new Intent(RegisterActivity.this, IndexActivity.class);
        startActivity(registrar);
    }
}