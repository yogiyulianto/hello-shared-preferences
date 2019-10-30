package com.dwi.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText edtNamaDepan, edtNamaBelakang;
    Button btnLogin;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtNamaDepan = findViewById(R.id.edtNamaDepan);
        edtNamaBelakang = findViewById(R.id.edtNamaBelakang);
        btnLogin = findViewById(R.id.btnLogin);
        sharedPreferences = getSharedPreferences("username", MODE_PRIVATE);
        //sharedPreferences = getSharedPreferences("password", MODE_PRIVATE);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
                final String namaDepan = edtNamaDepan.getText().toString();
                final String namaBelakang = edtNamaBelakang.getText().toString();
                final SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("nama_depan", namaDepan);
                editor.putString("nama_belakang", namaBelakang);
                editor.commit();
            }
        });
    }
}
