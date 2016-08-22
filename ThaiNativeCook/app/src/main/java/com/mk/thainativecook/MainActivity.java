package com.mk.thainativecook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgbtnjpk,imgbtnca,imgbtnkgc,imgbtnkhl,imgbtnknk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbtnjpk =(ImageButton) findViewById(R.id.imgbtnjpk);
        imgbtnca =(ImageButton) findViewById(R.id.imgbtnca);
        imgbtnkgc =(ImageButton) findViewById(R.id.imgbtnkgc);
        imgbtnkhl =(ImageButton) findViewById(R.id.imgbtnkhl);
        imgbtnknk =(ImageButton) findViewById(R.id.imgbtnknk);


        imgbtnjpk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jpk = new Intent(getApplicationContext(), JpkActivity.class);
                startActivity(jpk);
            }
        });

        imgbtnca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), CaActivity.class);
                startActivity(ca);
            }
        });

        imgbtnkgc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kgc = new Intent(getApplicationContext(), KgcActivity.class);
                startActivity(kgc);
            }
        });
        imgbtnkhl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent khl = new Intent(getApplicationContext(), KhlActivity.class);
                startActivity(khl);
            }
        });
        imgbtnknk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent knk = new Intent(getApplicationContext(), KnkActivity.class);
                startActivity(knk);
            }
        });
    }
}
