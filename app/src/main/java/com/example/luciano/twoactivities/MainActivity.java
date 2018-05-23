package com.example.luciano.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.util.Log.*;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();//aqui agregamos una constante a log, que usa el nombre de la clase como etiqueta
    @Override
    protected void onCreate(Bundle savedInstanceState) { //aqui es donde se incia la actividad, creo que es un metodo
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {//la cree desde los atributos del boton con al enter en metodo on click
        d(LOG_TAG,"Button clicked!"); //Log tag es una variable
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
