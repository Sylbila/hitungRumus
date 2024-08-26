package com.example.uts_mobile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSegiempat;
    Button btnSegitiga;
    Button btnLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSegiempat = findViewById(R.id.btnSegiempat);
        btnSegitiga = findViewById(R.id.btnSegitiga);
        btnLingkaran = findViewById(R.id.btnLingkaran);

        btnSegiempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,Segiempat.class);
                startActivity(pindah);
            }
        });
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah2 = new Intent(MainActivity.this,segitiga.class);
                startActivity(pindah2);
            }
        });
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah3 = new Intent(MainActivity.this,Lingkaran.class);
                startActivity(pindah3);
            }
        });

    }
}