package com.example.kasvinlisays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lajinLisays = findViewById(R.id.lajinLisays);
        Button otaKuva = findViewById(R.id.otaKuva);
        Button valmis = findViewById(R.id.valmis);

        TextView nimi = findViewById(R.id.kasvinNimi);
        TextView kasviLaji = findViewById(R.id.kasviLaji);




        lajinLisays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        otaKuva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        valmis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        
    }
}
