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
    }

    public void onClick(View vista){
        EditText oper1, oper2;
        oper1 = (EditText)findViewById(R.id.Num1); // se obtiene los datos del usuario
        oper2 = (EditText)findViewById(R.id.Num2);

        TextView resultado = (TextView)findViewById(R.id.ViewResultado); // aqui se mostrar el resultado
        try{

            int a = Integer.parseInt(oper1.getText().toString()); //los datos agregador por el usuario se convierten en interger para poder sumar
            int b = Integer.parseInt(oper2.getText().toString()); //los datos agregador por el usuario se convierten en interger para poder sumar

            resultado.setText("Resultado : "+ (a + b)); //Se imprime el resultado
        }catch (Exception e){
            resultado.setText("Los datos solo deben ser numeros"); //en caso de error se imprime esto
        };

    }
    public void Dividir(View v){
        EditText oper1, oper2;
        oper1 = (EditText)findViewById(R.id.Num1); // se obtiene los datos del usuario
        oper2 = (EditText)findViewById(R.id.Num2);

        TextView resultado = (TextView)findViewById(R.id.ViewResultado); // aqui se mostrar el resultado
        try{

            double a = Double.valueOf(oper1.getText().toString()).doubleValue(); //los datos agregador por el usuario se convierten en interger para poder sumar
            double b = Double.valueOf(oper2.getText().toString()).doubleValue(); //los datos agregador por el usuario se convierten en interger para poder sumar

            resultado.setText("Resultado : "+ (a / b)); //Se imprime el resultado
        }catch (Exception e){
            resultado.setText("Los datos solo deben ser numeros"); //en caso de error se imprime esto
        };
    }

    public void Restar(View v){
        EditText oper1, oper2;
        oper1 = (EditText)findViewById(R.id.Num1); // se obtiene los datos del usuario
        oper2 = (EditText)findViewById(R.id.Num2);

        TextView resultado = (TextView)findViewById(R.id.ViewResultado); // aqui se mostrar el resultado
        try{

            int a = Integer.parseInt(oper1.getText().toString()); //los datos agregador por el usuario se convierten en interger para poder sumar
            int b = Integer.parseInt(oper2.getText().toString()); //los datos agregador por el usuario se convierten en interger para poder sumar

            resultado.setText("Resultado : " + (a - b)); //Se imprime el resultado
        }catch (Exception e){
            resultado.setText("Los datos solo deben ser numeros"); //en caso de error se imprime esto
        };
    }

    public void Multiplicar(View v){
        EditText oper1, oper2;
        oper1 = (EditText)findViewById(R.id.Num1); // se obtiene los datos del usuario
        oper2 = (EditText)findViewById(R.id.Num2);

        TextView resultado = (TextView)findViewById(R.id.ViewResultado); // aqui se mostrar el resultado
        try{

            int a = Integer.parseInt(oper1.getText().toString()); //los datos agregador por el usuario se convierten en interger para poder sumar
            int b = Integer.parseInt(oper2.getText().toString()); //los datos agregador por el usuario se convierten en interger para poder sumar

            resultado.setText("Resultado : " + (a * b)); //Se imprime el resultado
        }catch (Exception e){
            resultado.setText("Los datos solo deben ser numeros"); //en caso de error se imprime esto
        };
    }
}
