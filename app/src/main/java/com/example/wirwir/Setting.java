package com.example.wirwir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Button Tambah = (Button)
                findViewById(R.id.btngm);

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Setting.this, Games.class);
                startActivity(i);
            }
        });

        Button Tampil = (Button)
                findViewById(R.id.btntm);

        Tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Setting.this, Timer.class);
                startActivity(i);
            }
        });

        Button Set = (Button)
                findViewById(R.id.btnl);

        Set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new
                        Intent(Setting.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}
