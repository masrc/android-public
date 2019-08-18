package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out = findViewById(R.id.result);
        out.setText("");
    }

    public void operacao (View view) {
        String op;

        if(view.getId() == R.id.soma) {
            EditText input1 = findViewById(R.id.first_value);
            EditText input2 = findViewById(R.id.second_value);

            if(input1.length() > 0 && input2.length() > 0) {
                int first_value = Integer.parseInt(input1.getText().toString());
                int second_value = Integer.parseInt(input2.getText().toString());
                int result = first_value+second_value;
                out.setText( "O resultado da soma é "+result);
            }else {
                Toast.makeText(this, "Digite numeros inteiros maiores que 0", Toast.LENGTH_LONG).show();
            }
        } else if (view.getId() == R.id.subtrai) {
            EditText input1 = findViewById(R.id.first_value);
            EditText input2 = findViewById(R.id.second_value);
            if(input1.length() > 0 && input2.length() > 0) {
                int first_value = Integer.parseInt(input1.getText().toString());
                int second_value = Integer.parseInt(input2.getText().toString());
                int result = first_value-second_value;
                out.setText( "O resultado da subtração é "+result);
            }else {
                Toast.makeText(this, "Digite numeros inteiros maiores que 0", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void soma (View view) {
        EditText input1 = findViewById(R.id.first_value);
        EditText input2 = findViewById(R.id.second_value);

        if(input1.length() > 0 && input2.length() > 0) {
            int first_value = Integer.parseInt(input1.getText().toString());
            int second_value = Integer.parseInt(input2.getText().toString());
            int result = first_value+second_value;
            out.setText( "O resultado da soma é "+result);
        }else {
            Toast.makeText(this, "Digite numeros inteiros maiores que 0", Toast.LENGTH_LONG).show();
        }
    }

    public void subtrai (View view) {
        EditText input1 = findViewById(R.id.first_value);
        EditText input2 = findViewById(R.id.second_value);
        if(input1.length() > 0 && input2.length() > 0) {
            int first_value = Integer.parseInt(input1.getText().toString());
            int second_value = Integer.parseInt(input2.getText().toString());
            int result = first_value-second_value;
            out.setText( "O resultado da subtração é "+result);
        }else {
            Toast.makeText(this, "Digite numeros inteiros maiores que 0", Toast.LENGTH_LONG).show();
        }
    }
}


