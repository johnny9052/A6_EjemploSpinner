package com.example.johnny.a6_ejemplospinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNum1, txtNum2;
    Spinner spnOperacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);

        spnOperacion = (Spinner) findViewById(R.id.spnOperacion);

        cargarOpciones();
    }

    public void cargarOpciones() {
        String[] opciones = { "sumar", "restar" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, opciones);

        spnOperacion.setAdapter(adapter);
    }


    public void operar(View view) {

        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        int res = 0;

        String opcion = spnOperacion.getSelectedItem().toString();

        if (opcion.equals("sumar")) {
            res = num1 + num2;
        } else {
            res = num1 - num2;
        }

        Toast.makeText(getApplicationContext(), "El resultado es " + res,
                Toast.LENGTH_SHORT).show();
    }

}
