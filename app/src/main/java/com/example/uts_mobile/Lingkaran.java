package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class Lingkaran extends AppCompatActivity {
    EditText edtJari, edtHasil;
    Button btnHasil,btnClear, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        edtHasil = findViewById(R.id.edtHasil2);
        edtJari = findViewById(R.id.edtJari);
        btnHasil = findViewById(R.id.btnHasil2);
        btnClear = findViewById(R.id.btnClearr);
        btnBack = findViewById(R.id.btnBackk);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jariStr = edtJari.getText().toString();
                if (jariStr.isEmpty()){
                    edtHasil.setText("Upss...Tidak ada inputan");
                } else{
                    try {
                        Integer jari = Integer.parseInt(jariStr);
                        double hasil = 3.14 * jari * jari;
                        edtHasil.setText(String.valueOf(hasil));
                    } catch (NumberFormatException error){
                        edtHasil.setText("Inputan harus berupa angka");
                    }
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Lingkaran.this,MainActivity.class);
                startActivity(pindah);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtJari.setText("");
                edtHasil.setText("");
            }
        });
    }
}