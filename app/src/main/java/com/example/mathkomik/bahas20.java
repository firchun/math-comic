package com.example.mathkomik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class bahas20 extends AppCompatActivity {

    ImageButton btn_next,btn_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahas20);
        btn_next = (ImageButton) findViewById(R.id.next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(bahas20.this, soal_latihan.class);
                startActivity(beach);
            }
        });
        btn_home = (ImageButton) findViewById(R.id.home);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(bahas20.this, MainActivity.class);
                startActivity(beach);
            }
        });
    }
}