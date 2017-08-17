package com.example.pipe.tallerfjson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText text;
    EditText textFactorial;
    Button botonCambio;
    Button botonFactorial;
    TextView cantidadFibo;
    TextView fechaFibo;
    TextView cantidadFac;
    TextView fechaFac;
    int contF = 0;
    int contFa = 0;
    Date date= new Date();
    Button botonPaises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text =(EditText) findViewById( R.id.textoInicio);
        textFactorial =(EditText) findViewById( R.id.textoFactorial);
        cantidadFibo = (TextView) findViewById(R.id.fiboinfo);
        fechaFibo = (TextView) findViewById(R.id.fibofecha);
        cantidadFac = (TextView) findViewById(R.id.facinfo);
        fechaFac = (TextView) findViewById(R.id.facfecha);
        cantidadFibo.setText(String.valueOf(contF));
        cantidadFac.setText(String.valueOf(contFa));


        botonCambio = (Button) findViewById(R.id.botonCalcular);
        botonCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("Cantidad",text.getText().toString());
                contF++;
                startActivity(intent);
                cantidadFibo.setText("Fibonacci: "+String.valueOf(contF));
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int hours = calendar.get(Calendar.HOUR_OF_DAY)-5;
                fechaFibo.setText("Fibonacci Día-hora: "+String.valueOf(date.getDay())+"-"+hours+"-"+date.getMinutes()+"-"+date.getSeconds());
            }
        });

       botonFactorial = (Button) findViewById(R.id.botonCalcularFactorial);
        botonFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                intent.putExtra("numero",textFactorial.getText().toString());
                contFa++;
                startActivity(intent);
                cantidadFac.setText("Factorial: "+String.valueOf(contFa));
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int hours = calendar.get(Calendar.HOUR_OF_DAY)-5;
                fechaFac.setText("Factorial Día-hora: "+String.valueOf(date.getDay())+"-"+hours+"-"+date.getMinutes()+"-"+date.getSeconds());

            }
        });

        botonPaises = (Button) findViewById(R.id.botonLista);
        botonPaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainListActivity.class);
                startActivity(intent);
            }
        });
    }
}
