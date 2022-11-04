package com.diegoarc.evaluaciongrupo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTituloPrincipal;
    TextView tvCarlos;
    TextView tvWilliam;
    TextView tvDiego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTituloPrincipal = findViewById(R.id.tvTituloPrincipal);
        tvCarlos = findViewById(R.id.tvCarlos);
        tvWilliam = findViewById(R.id.tvWilliam);
        tvDiego = findViewById(R.id.tvDiego);
    }
}