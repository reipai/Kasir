package com.reivai.ikasir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ProductPage1 extends AppCompatActivity {

    Button btn_lp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_page1);

        btn_lp = (Button)findViewById(R.id.btn_lp);

        btn_lp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProductPage1.this, ProductPageList.class);
                startActivity(i);
                finish();
            }
        });
    }
}
