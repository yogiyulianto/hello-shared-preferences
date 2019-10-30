package com.dwi.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNama = findViewById(R.id.tvNamaDepan);

        sharedPreferences = getSharedPreferences("username", MODE_PRIVATE);

        String namaDepan = sharedPreferences.getString("nama_depan", "nama_depan");
        String namaBelakang = sharedPreferences.getString("nama_belakang", "nama_belakang");

        tvNama.setText("Hello " + namaDepan + " " + namaBelakang);
    }
}
