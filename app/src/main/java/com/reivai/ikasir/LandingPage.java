package com.reivai.ikasir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.content.Intent;

public class LandingPage extends AppCompatActivity {

    Spinner spin;
    String[] SpinValues = {"Cuci Kendaraan", "iSat Coffee Shop"};
    String SpinValue;
    Button btn_proses;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        spin = (Spinner) findViewById(R.id.spin);
        btn_proses = (Button) findViewById(R.id.btn_proses);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(LandingPage.this, android.R.layout.simple_spinner_item, SpinValues);
        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                SpinValue = (String)spin.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btn_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (SpinValue) {
                    case "Cuci Kendaraan" :
                        i = new Intent(LandingPage.this, ProductPage1.class);
                        startActivity(i);
                        break;

                    case "iSat Coffee Shop" :
                        i = new Intent(LandingPage.this, ProductPageList.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
