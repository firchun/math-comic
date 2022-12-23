package com.example.mathkomik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mathkomik.databinding.ActivityChapter1Binding;

public class daftar extends AppCompatActivity {

    Button btn_chapter1;
    Button btn_chapter2;
    Button btn_chapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        //tombol chapter 1

        btn_chapter1 = (Button) findViewById(R.id.chapter1);

        btn_chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(daftar.this, chapter1.class);
                startActivity(beach);
            }
        });

        //tombol chapter 2

        btn_chapter2 = (Button) findViewById(R.id.chapter2);

        btn_chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(daftar.this, chapter2.class);
                startActivity(beach);
            }
        });

        //tombol chapter 3

        btn_chapter3 = (Button) findViewById(R.id.chapter3);

        btn_chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(daftar.this, chapter3.class);
                startActivity(beach);
            }
        });


    }
}