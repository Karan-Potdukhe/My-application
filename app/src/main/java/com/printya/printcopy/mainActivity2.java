package com.printya.printcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class mainActivity2 extends AppCompatActivity {
    ImageButton Image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Image= (ImageButton) findViewById(R.id.imgv7);
        Image.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(mainActivity2.this,visitng7.class);
                                        startActivity(intent);

                                    }
                                }

        );
        Image= (ImageButton) findViewById(R.id.imgv8);
        Image.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(mainActivity2.this,visitng8.class);
                                         startActivity(intent);

                                     }
                                 }

        );
        Image= (ImageButton) findViewById(R.id.imgv9);
        Image.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(mainActivity2.this,visitng9.class);
                                         startActivity(intent);

                                     }
                                 }

        );
        Image= (ImageButton) findViewById(R.id.imgv10);
        Image.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(mainActivity2.this,visitng10.class);
                                         startActivity(intent);

                                     }
                                 }

        );
        Image= (ImageButton) findViewById(R.id.imgv11);
        Image.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(mainActivity2.this,visitng11.class);
                                         startActivity(intent);

                                     }
                                 }

        );
        Image= (ImageButton) findViewById(R.id.imgv12);
        Image.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(mainActivity2.this,visitng12.class);
                                         startActivity(intent);

                                     }
                                 }

        );

    }
}
