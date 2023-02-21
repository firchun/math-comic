package com.example.mathkomik;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class latihan20 extends AppCompatActivity {

    Button btn_back,btn_d,btn_a,btn_b,btn_c;
    Button btn_next;
    ImageButton btn_restart,btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan20);

        final MediaPlayer jawaban1 = MediaPlayer.create(this, R.raw.false2);
        final MediaPlayer jawaban2 = MediaPlayer.create(this, R.raw.false2);
        final MediaPlayer jawaban3 = MediaPlayer.create(this, R.raw.true2);
        final MediaPlayer jawaban4 = MediaPlayer.create(this, R.raw.false2);

        btn_home = (ImageButton) findViewById(R.id.img_button_home);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(latihan20.this, MainActivity.class);
                startActivity(beach);
            }
        });
        btn_restart = (ImageButton) findViewById(R.id.img_button_start);

        btn_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(latihan20.this, soal_latihan.class);
                startActivity(beach);
            }
        });

        btn_back = (Button) findViewById(R.id.ulang);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(latihan20.this, soal_latihan.class);
                startActivity(beach);
            }
        });

        btn_next = (Button) findViewById(R.id.home);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beach = new  Intent(latihan20.this, MainActivity.class);
                startActivity(beach);
            }
        });
        btn_a = (Button) findViewById(R.id.a);
        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jawabanSalah();
                jawaban1.start();
            }
        });
        btn_b = (Button) findViewById(R.id.b);
        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jawabanSalah();
                jawaban2.start();
            }
        });
        btn_c = (Button) findViewById(R.id.c);
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jawabanBenar();
                jawaban3.start();
            }
        });
        btn_d = (Button) findViewById(R.id.d);
        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jawabanSalah();
                jawaban4.start();
            }
        });



    }
    private void jawabanBenar(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("HORE!!!");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Jawaban Anda benar....")
                .setIcon(R.drawable.benar)
                .setCancelable(false)
                .setPositiveButton("Next",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        Intent beach = new  Intent(latihan20.this, bahas20.class);
                        startActivity(beach);
                    }
                })
                .setNegativeButton("Cencel",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        dialog.cancel();
                    }
                })
        ;

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
    private void jawabanSalah(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("YAHHHH!!!");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Jawaban Anda Salah...")
                .setIcon(R.drawable.salah)
                .setCancelable(false)
                .setPositiveButton("cancel",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        dialog.cancel();
                    }
                })
//                .setNegativeButton("Cencel",new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog,int id) {
//                        // jika tombol diklik, maka akan menutup activity ini
//                        dialog.cancel();
//                    }
//                })
        ;

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}