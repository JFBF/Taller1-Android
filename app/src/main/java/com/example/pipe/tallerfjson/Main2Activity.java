package com.example.pipe.tallerfjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    LinearLayout linear;
    int contador = 2;
    List<Integer> lista = new ArrayList<>();
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int cantidad = Integer.parseInt(getIntent().getStringExtra("Cantidad"));

        lista.add(0);
        lista.add(1);
        texto =(TextView) findViewById( R.id.textoinicial);
        texto.setText((lista.get(0).toString()+lista.get(1).toString()));

        for(int i = 0; i < cantidad ; i ++)
        {
            TextView tv = new TextView(this);
            String valor = fibonacci();
            tv.setText(valor);
            contador++;
            lista.add(Integer.parseInt(valor));
            linear = (LinearLayout) findViewById(R.id.layoutID);
            linear.addView(tv);
        }
    }

    String fibonacci ()
    {
        return (lista.get(contador-2)+lista.get(contador-1))+"";
    }

}
