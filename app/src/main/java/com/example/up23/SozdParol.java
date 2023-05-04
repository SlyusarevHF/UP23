package com.example.up23;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SozdParol extends AppCompatActivity {
    private Button btn1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sozd_parol);
        btn1 = findViewById(R.id.btnSkipPar);
        btn1.setOnClickListener(v ->

        {
            Intent intent = new Intent(SozdParol.this, SkP.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }
}