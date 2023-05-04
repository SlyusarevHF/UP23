package com.example.up23;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Vhod_Reg extends AppCompatActivity {
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.vhod_reg);
        btn1 = findViewById(R.id.btn_dalee);
        btn1.setOnClickListener(v ->

        {
            Intent intent = new Intent(Vhod_Reg.this, SozdParol.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }
}
