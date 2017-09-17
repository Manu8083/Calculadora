package com.example.manuelromero.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;


public class Calculadora extends AppCompatActivity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        View boton = findViewById(R.id.BotonSumar);
        boton.setOnClickListener(this);
        //recomendado por video boton.setOnClickListener(this);
    }

    public void onClick(View vista){
        TextView temp;
        temp = (TextView) findViewById(R.id.Num1);
        TextView resultado = (TextView)findViewById(R.id.ViewResultado);
        try{
            float a = Float.parseFloat(temp.getText().toString());
            temp = (TextView) findViewById(R.id.Num2);
            float b = Float.parseFloat(temp.getText().toString());
            resultado.setText("Resultado : "+ (a + b));
        }catch (Exception e){};

            resultado.setText("Los datos solo deben ser numeros");

    }

}
