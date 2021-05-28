package com.fausto.hellowtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView txtContador;
private int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtContador = findViewById(R.id.txtContador);
        contador = 0;
    }

    public void mostrarSaludo(View view) {

        // mostrar un toast con un saludo

        Toast.makeText(this,R.string., Toast.LENGTH_SHORT).show();
        Toast.makeText(this,R.string.)
    }

    public void actualizarContador(View view) {

        contador++;
        //mostrar en el txtviewer el valor de la variable contador.

        txtContador.setText(Integer.toString(contador));
    }
}