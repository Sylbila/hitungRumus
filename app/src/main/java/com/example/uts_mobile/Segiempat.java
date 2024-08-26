package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class Segiempat extends AppCompatActivity {
    EditText edtPanjang, edtLebar, edtHasil3;
    Button btnHasil3, btnClearrr, btnBackkk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segiempat);
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        edtHasil3 = findViewById(R.id.edtHasil3);
        btnHasil3 = findViewById(R.id.btnHasil3);
        btnClearrr = findViewById(R.id.btnClearrr);
        btnBackkk = findViewById(R.id.btnBackkk);

        btnHasil3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjangStr = edtPanjang.getText().toString();
                String lebarStr = edtLebar.getText().toString();
                if (panjangStr.isEmpty() || lebarStr.isEmpty()) {
                    edtHasil3.setText("Upss...Tidak ada inputan");
                } else {
                    try {
                        Integer panjang = Integer.parseInt(panjangStr);
                        Integer lebar = Integer.parseInt(lebarStr);
                        Integer hasil3 = panjang * lebar;
                        edtHasil3.setText(String.valueOf(hasil3));
                    } catch (NumberFormatException error){
                        edtHasil3.setText("Inputan harus berupa angka");
                    }
                }
            }
        });
        btnBackkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //halaman yg sekarang         //halaman tujuan
                Intent pindah = new Intent(Segiempat.this,MainActivity.class);
                startActivity(pindah);
            }
        });
        btnClearrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtPanjang.setText("");
                edtLebar.setText("");
                edtHasil3.setText("");
            }
        });
    }
}