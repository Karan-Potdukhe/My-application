package com.printya.printcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.wedding);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,WeddingDash.class);
                startActivity(intent);
            }
        });


        ImageView imageView2 = findViewById(R.id.pamp);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Pamplate.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = findViewById(R.id.birthday);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,birthday.class);
                startActivity(intent);
            }
        });
        ImageView imageView4 = findViewById(R.id.funerala);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,funeral.class);
                startActivity(intent);
            }
        });
        ImageView imageView5 = findViewById(R.id.enve);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Envelopea.class);
                startActivity(intent);
            }
        });
        ImageView imageView6 = findViewById(R.id.banners);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Bannerprojecta.class);
                startActivity(intent);
            }
        });


        ImageView imageView7 = findViewById(R.id.ban);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Bannerprojecta.class);
                startActivity(intent);
            }
        });
        ImageView imageView8 = findViewById(R.id.visiting);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,visiting.class);
                startActivity(intent);
            }
        });


    }
}
