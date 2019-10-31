package com.printya.printcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class mainactivity3 extends AppCompatActivity {
ImageButton Image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity3);
        Image1= (ImageButton) findViewById(R.id.imgv13);
        Image1.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(mainactivity3.this,visiting13.class);
                                         startActivity(intent);

                                     }
                                 }

        );
        Image1= (ImageButton) findViewById(R.id.imgv14);
        Image1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(mainactivity3.this,visitng14.class);
                                          startActivity(intent);

                                      }
                                  }

        );
        Image1= (ImageButton) findViewById(R.id.imgv15);
        Image1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(mainactivity3.this,vsitng15.class);
                                          startActivity(intent);

                                      }
                                  }

        );
        Image1= (ImageButton) findViewById(R.id.imgv16);
        Image1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(mainactivity3.this,visitng16.class);
                                          startActivity(intent);

                                      }
                                  }

        );
        Image1= (ImageButton) findViewById(R.id.imgv17);
        Image1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(mainactivity3.this,visitng17.class);
                                          startActivity(intent);

                                      }
                                  }

        );
        Image1= (ImageButton) findViewById(R.id.imgv18);
        Image1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(mainactivity3.this,visitng18.class);
                                          startActivity(intent);

                                      }
                                  }

        );



    }
}
