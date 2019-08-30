package com.cedisropa.reversar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cedisropa.libreversar.Arreglos.Arreglos;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //String miarray [] = {"1","2","3","4","5"};

        Arreglos.getArreglo_invertido();
    }
}
