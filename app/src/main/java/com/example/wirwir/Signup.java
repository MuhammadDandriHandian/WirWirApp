package com.example.wirwir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button Tambah = (Button)
                findViewById(R.id.btnlog);

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Signup.this, Games.class);
                startActivity(i);
            }
        });

        Button Tampil = (Button)
                findViewById(R.id.btnsgn);

        Tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Signup.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
