package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Halaman2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        Button btn1 = findViewById(R.id.btn1_2);
        Button btn2 = findViewById(R.id.btn2_2);
        Button btn3 = findViewById(R.id.btn3_2);
        Button btn4 = findViewById(R.id.btn4_2);
        Button btn5 = findViewById(R.id.btn5);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Halaman2.this, "Barang 1",Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Halaman2.this, Halamanparfcn1.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Halaman2.this, "Barang 2",Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Halaman2.this, Halamanparfcn2.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Halaman2.this, "Barang 3",Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Halaman2.this, Halamanparfcn3.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Halaman2.this, "Barang 4",Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Halaman2.this, Halamanparfcn4.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Halaman2.this, "Barang 5",Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(Halaman2.this, Halamanparfcn5.class);
                startActivity(intent);
            }
        });
    }


}