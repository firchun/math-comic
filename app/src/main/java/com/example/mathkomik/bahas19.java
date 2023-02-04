package com.example.mathkomik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bahas19 extends AppCompatActivity {

    Button btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahas19);
        btn_next = (Button) findViewById(R.id.next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(bahas19.this, latihan20.class);
                startActivity(beach);
            }
        });
    }
}