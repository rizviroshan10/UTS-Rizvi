package com.if3b.uts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNamaLengkap;
    EditText etNomorPendaftaran;
    Button btnDaftar;
    CheckBox cbConfir;
    Spinner spJalurPendaftaran;

    String NomorPendaftaran, NamaLengkap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_Nomor_Pendaftaran);
        etNamaLengkap = findViewById(R.id.et_Nama_Lengkap);
        btnDaftar = findViewById(R.id.btn_Daftar);
        cbConfir = findViewById(R.id.cb_Konfirmasi_Pendaftaran);
        spJalurPendaftaran = findViewById(R.id.sp_Jalur_Pendaftaran);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NamaLengkap = etNamaLengkap.getText().toString();
                String NomorPendaftaran = etNomorPendaftaran.getText().toString();
                String confir = cbConfir.getText().toString();
                String spinner = String.valueOf(spJalurPendaftaran.getSelectedItem());


                if (NamaLengkap.trim().equals("")) {
                    etNamaLengkap.setError("Nama Harus Diisi");
                }

                else if (NomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor Pendaftaran Harus Diisi");
                }
                else if (!cbConfir.isChecked()){
                    Toast.makeText(MainActivity.this, "Centang Ui", Toast.LENGTH_SHORT).show();
                }
                else if(spinner.equalsIgnoreCase("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Jalur Pendaftaran Belom Dipilih!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent Daftar = new Intent(MainActivity.this, SecondActivity.class);
                    Daftar.putExtra("xnama", NamaLengkap);
                    Daftar.putExtra("noDaftaran", NomorPendaftaran);
                    Daftar.putExtra("confir", confir);
                    Daftar.putExtra("sp", spinner);
                    startActivity(Daftar);
                }
            }
        });
    }
}
