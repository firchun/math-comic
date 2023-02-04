package com.example.mathkomik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class soal_latihan extends AppCompatActivity {

    Button btn_mulai,btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_latihan);

        btn_mulai = (Button) findViewById(R.id.mulai);

        btn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(soal_latihan.this, latihan1.class);
                startActivity(beach);
            }
        });
        btn_home = (Button) findViewById(R.id.home);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(soal_latihan.this, MainActivity.class);
                startActivity(beach);
            }
        });
    }
}