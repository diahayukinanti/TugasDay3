package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Halamanparfgc3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanparfgc3);

        Button btnShare = findViewById(R.id.btnShare);
        btnShare.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intentShare = new Intent();
        intentShare.setAction(Intent.ACTION_SEND);
        intentShare.putExtra(Intent.EXTRA_TEXT, "INI TOKO PARFUME");
        intentShare.setType("plain/text");


        if (intentShare.resolveActivity(getPackageManager()) != null){
            startActivity(intentShare);
        }
    }
}