package com.printya.printcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class visiting extends AppCompatActivity {
    ImageButton img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visiting);

        img1= (ImageButton) findViewById(R.id.img1);
        img1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(visiting.this, VisitngMain2Activity.class);
                                        startActivity(intent);

                                    }
                                }

        );
        img1= (ImageButton) findViewById(R.id.img2);
        img1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(visiting.this, visitngMain3Activity.class);
                                        startActivity(intent);

                                    }
                                }

        );
        img1= (ImageButton) findViewById(R.id.img3);
        img1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(visiting.this,visitng4.class);
                                        startActivity(intent);

                                    }
                                }

        );
        img1= (ImageButton) findViewById(R.id.img4);
        img1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(visiting.this,vistng45.class);
                                        startActivity(intent);

                                    }
                                }

        );
        img1= (ImageButton) findViewById(R.id.img5);
        img1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(visiting.this,visitng5.class);
                                        startActivity(intent);

                                    }
                                }

        );
        img1= (ImageButton) findViewById(R.id.img6);
        img1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(visiting.this,visitng61.class);
                                        startActivity(intent);

                                    }
                                }

        );
    }
}
