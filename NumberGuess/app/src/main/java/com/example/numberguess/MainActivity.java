package com.example.numberguess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int num,tries;
    private Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = new Random();
        num = r.nextInt(100) + 1;
        tries = 0;
    }

    public void guess(View view){
        EditText input = findViewById(R.id.input);
        TextView hint = findViewById(R.id.hint);

        if(input.length() == 0) {
            hint.setText("Digite um número inteiro");
        } else {
            String tip;
            int inputNumber = Integer.parseInt(input.getText().toString());
            tries++;

            if(inputNumber > this.num){
                tip = "O número sorteado é menor";
            }else if (inputNumber < this.num) {
                tip = "O número sorteado é maior";
            } else {
                tip = "Você acertou! " + tries + " tentativas";
            }

            hint.setText(tip);
        }

    }
}
