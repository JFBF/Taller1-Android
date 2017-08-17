package com.example.pipe.tallerfjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    LinearLayout linear;
    int cantidad = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        cantidad = Integer.parseInt(getIntent().getStringExtra("numero"));
        factorial();
        
    }

    void factorial ()
    {
        int valor = 1;
        String calculo = "";
        for(int i = 1; i <=cantidad;i++ ){
            valor = valor*i;
            calculo = calculo+"*"+String.valueOf(i);
        }

        linear = (LinearLayout) findViewById(R.id.layoutFactorial);
        TextView tv = new TextView(this);
        tv.setText("Multiplicación "+calculo);
        linear.addView(tv);
        tv = new TextView(this);
        tv.setText("Resultado "+valor);
        linear.addView(tv);
    }
}
