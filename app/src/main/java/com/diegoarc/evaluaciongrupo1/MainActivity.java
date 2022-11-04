package com.diegoarc.evaluaciongrupo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.time.Instant;


public class MainActivity extends AppCompatActivity {
    TextView tvTituloPrincipal;
    TextView tvCarlos;
    TextView tvWilliam;
    TextView tvDiego;
    ImageView imgInternet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTituloPrincipal = findViewById(R.id.tvTituloPrincipal);
        tvCarlos = findViewById(R.id.tvCarlos);
        tvWilliam = findViewById(R.id.tvWilliam);
        tvDiego = findViewById(R.id.tvDiego);
        imgInternet = findViewById(R.id.imgInternet);
        Glide.with(this).load("https://img.freepik.com/vector-gratis/ilustracion-concepto-programacion_114360-1351.jpg").into(imgInternet);

    }
}