package com.printya.printcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Envelopea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envelopea);


        Spinner spinnera = (Spinner) findViewById(R.id.abc);
        Spinner spinnerb = (Spinner) findViewById(R.id.bcd);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.abc, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnera.setAdapter(adapter);

        ArrayAdapter<CharSequence> adaptera = ArrayAdapter.createFromResource(this, R.array.bcd, android.R.layout.simple_spinner_item);
        adaptera.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerb.setAdapter(adaptera);

    }
}
