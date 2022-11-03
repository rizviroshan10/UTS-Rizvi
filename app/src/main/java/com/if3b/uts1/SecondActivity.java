package com.if3b.uts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv_nama;
    TextView tv_NoPendaftaran;
    TextView tv_jalurDaftar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tv_nama = findViewById(R.id.tv_nama);
        tv_NoPendaftaran = findViewById(R.id.tv_noPendaftaran);
        tv_jalurDaftar = findViewById(R.id.tv_jalurPendaftaran);
        Intent tampil = getIntent();
        String dNama = tampil.getStringExtra("xnama");
        tv_nama.setText(dNama);
        String noDaftar = tampil.getStringExtra("noDaftaran");
        tv_NoPendaftaran.setText(noDaftar);
        String sp1 = tampil.getStringExtra("sp");
        tv_jalurDaftar.setText(sp1);
    }
}