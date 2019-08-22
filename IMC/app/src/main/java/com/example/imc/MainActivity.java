package com.example.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculaImc(View view) {
        EditText altura = findViewById(R.id.altura);
        EditText peso = findViewById(R.id.peso);
        RadioButton generoF = findViewById(R.id.feminino);
        TextView resultado = findViewById(R.id.resultado);


        float alturaUser = Float.parseFloat(altura.getText().toString());
        float pesoUser = Float.parseFloat(peso.getText().toString());

        alturaUser = alturaUser * alturaUser;

        float imc = pesoUser/alturaUser;
        
        if(generoF.isChecked() == true) // fem
        {
            if(imc < 19.1) {
                resultado.setText("O seu IMC é: " + imc + ", abaixo do peso");
            }

            if(imc > 19.1 && imc < 25.8) {
                resultado.setText("O seu IMC é: " + imc + ", normal");
            }

            if(imc > 25.8 && imc < 27.3) {
                resultado.setText("O seu IMC é: " + imc + ", marginalmente acima do peso");
            }

            if(imc > 27.3 && imc < 32.3) {
                resultado.setText("O seu IMC é: " + imc + ", acima do peso");
            }

            if(imc > 32.3) {
                resultado.setText("O seu IMC é: " + imc + ", obeso");
            }

        } else {
            if(imc < 20.7) {
                resultado.setText("O seu IMC é: " + imc + ", abaixo do peso");
            }

            if(imc > 20.7 && imc < 26.4) {
                resultado.setText("O seu IMC é: " + imc + ", normal");
            }

            if(imc > 26.4 && imc < 27.8) {
                resultado.setText("O seu IMC é: " + imc + ", marginalmente acima do peso");
            }

            if(imc > 27.8 && imc < 31.1) {
                resultado.setText("O seu IMC é: " + imc + ", acima do peso");
            }

            if(imc > 31.1) {
                resultado.setText("O seu IMC é: " + imc + ", obeso");
            }
        }
    }
}
