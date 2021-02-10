package com.exemplo.areatriangulo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextAltura;
    private EditText editTextBase;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associa os componentes da interface aos componentes da classe
        editTextAltura = findViewById(R.id.editTextAltura);
        editTextBase = findViewById(R.id.editTextBase);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void onClickButtonCalcular(View v) {
        if (!editTextAltura.getText().toString().equals("")) {
            if (!editTextBase.getText().toString().equals("")) {
                double area = (Double.parseDouble(editTextAltura.getText().toString()) + Double.parseDouble(editTextBase.getText().toString())) / 2.0;
                textViewResultado.setText("A área é: " + area);
            } else {
                Toast.makeText(MainActivity.this, "Digite a base!", Toast.LENGTH_SHORT).show();
                //Coloca o foco na caixa de texto número1
                editTextBase.requestFocus();
            }
        } else {
            Toast.makeText(MainActivity.this, "Digite a altura!", Toast.LENGTH_SHORT).show();
            //Coloca o foco na caixa de texto número1
            editTextAltura.requestFocus();
        }
    }

    public void onClickButtonLimpar(View v) {
        editTextAltura.setText("");
        editTextBase.setText("");
        textViewResultado.setText("A área é:");
    }

    public void onClickBotaoFechar(View v) {
        System.exit(0);
    }
}