package com.example.wirwir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class timer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer2);

        Button Tambah = (Button)
                findViewById(R.id.btngames);

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(timer2.this, Games.class);
                startActivity(i);
            }
        });

        Button Tampil = (Button)
                findViewById(R.id.button28);

        Tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(timer2.this, Setting.class);
                startActivity(i);
            }
        });

        Button Time = (Button)
                findViewById(R.id.btnoff);

        Time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(timer2.this, Timer.class);
                startActivity(i);
            }
        });

    }
}
