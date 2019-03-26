package com.example.kasvinlisays;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    String kasvinLaji;
    String kasviNimi;

    private void dispatchPictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

 /*   @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            kasvinKuva.setImageBitmap(imageBitmap);
        }
    }
    */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lajinLisays = findViewById(R.id.lajinLisays);
        Button otaKuva = findViewById(R.id.otaKuva);
        Button valmis = findViewById(R.id.valmis);

        final TextView nimi = findViewById(R.id.kasvinNimi);
        kasviNimi = nimi.getText().toString();
        final TextView kasviLaji = findViewById(R.id.kasviLaji);


        lajinLisays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kasvinLaji = kasviLaji.getText().toString();

            }
        });

        otaKuva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchPictureIntent();

            }

        });


        valmis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
