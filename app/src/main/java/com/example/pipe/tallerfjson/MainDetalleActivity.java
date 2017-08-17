package com.example.pipe.tallerfjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainDetalleActivity extends AppCompatActivity {

    String detalle;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_detalle);

        layout = (LinearLayout) findViewById(R.id.detalleList);
        detalle = getIntent().getStringExtra("todo");

        TextView tx = new TextView(this);
        tx.setText(detalle);
        layout.addView(tx);

    }
}
