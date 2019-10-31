package com.printya.printcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Pamplate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pamplate);


        ImageView imageView = findViewById(R.id.single);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pamplate.this,SinglePamplate.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = findViewById(R.id.multi);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pamplate.this,DoublePamplate.class);
                startActivity(intent);
            }
        });
    }
}
