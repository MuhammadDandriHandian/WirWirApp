package com.example.wirwir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Timer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        Button Tambah = (Button)
                findViewById(R.id.btngame);

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Timer.this, Games.class);
                startActivity(i);
            }
        });

        Button Tampil = (Button)
                findViewById(R.id.btnsetting);

        Tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Timer.this, Setting.class);
                startActivity(i);
            }
        });

        Button Time= (Button)
                findViewById(R.id.btnon);

        Time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Timer.this, timer2.class);
                startActivity(i);
            }
        });

    }
}
