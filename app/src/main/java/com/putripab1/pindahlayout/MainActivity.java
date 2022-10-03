package com.putripab1.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button getBtnPindah;
    EditText etNama;

    Button btnPindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("JANGAN LUPA SENYUM HARI INI PUT ");

        btnPindah = findViewById(R.id.btn_pindah);
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pindah =new Intent(MainActivity.this, SecondActivity.class);
                startActivity(Pindah);


            }
        });
    }
}