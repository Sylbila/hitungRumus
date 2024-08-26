package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class segitiga extends AppCompatActivity {
    EditText alas, tinggi, hasil;
    Button btnHasil, btnClear, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        alas = findViewById(R.id.edtAlas);
        tinggi = findViewById(R.id.edtTinggi);
        hasil = findViewById(R.id.edtHasil1);
        btnHasil = findViewById(R.id.btnHasil1);
        btnClear = findViewById(R.id.btnClear);
        btnBack = findViewById(R.id.btnBack);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alasStr = alas.getText().toString();
                String tinggiStr = tinggi.getText().toString();
                if (alasStr.isEmpty()||tinggiStr.isEmpty()){
                    hasil.setText("Upss...Tidak ada inputan");
                } else {
                    try {
                        Integer alasInt = Integer.parseInt(alasStr);
                        Integer tinggiInt = Integer.parseInt(tinggiStr);
                        double hasill = 0.5 * alasInt * tinggiInt;
                        hasil.setText(String.valueOf(hasill));
                    } catch (NumberFormatException error) {
                        hasil.setText("Inputan harus berupa angka");
                    }
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent pindah = new Intent(segitiga.this,MainActivity.class);
                    startActivity(pindah);
                }
            });
        btnClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    alas.setText("");
                    tinggi.setText("");
                    hasil.setText("");
                }
            });
    }
}
