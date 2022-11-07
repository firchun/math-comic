package com.example.mathkomik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    Button btn_pendahuluan;
    Button btn_pengenalan;
    Button btn_daftar;
    Button btn_rangkuman;
    Button btn_soal_latihan;
    Button btn_petunjuk;
    Button btn_profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_pendahuluan = (Button) findViewById(R.id.prolog);

        btn_pendahuluan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(MainActivity.this, Pendahuluan.class);
                startActivity(beach);
            }
        });

        btn_pengenalan = (Button) findViewById(R.id.pengenalan_tokoh);

        btn_pengenalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(MainActivity.this, pengenalan.class);
                startActivity(beach);
            }
        });

        btn_daftar = (Button) findViewById(R.id.daftar_cerita);

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(MainActivity.this, daftar.class);
                startActivity(beach);
            }
        });

        btn_rangkuman = (Button) findViewById(R.id.rangkuman);

        btn_rangkuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(MainActivity.this, rangkuman.class);
                startActivity(beach);
            }
        });

        btn_soal_latihan = (Button) findViewById(R.id.soal_latihan);

        btn_soal_latihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(MainActivity.this, soal_latihan.class);
                startActivity(beach);
            }
        });

        btn_petunjuk = (Button) findViewById(R.id.petunjuk);

        btn_petunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(MainActivity.this, petunjuk.class);
                startActivity(beach);
            }
        });

        btn_profil = (Button) findViewById(R.id.profil);

        btn_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(MainActivity.this, profil.class);
                startActivity(beach);
            }
        });
    }
}