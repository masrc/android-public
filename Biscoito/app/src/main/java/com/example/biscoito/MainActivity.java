package com.example.biscoito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> frases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frases = new ArrayList<String>();
        frases.add("A vida trará coisas boas se tiveres paciência.");
        frases.add("Demonstre amor e alegria em todas as oportunidades e verás que a paz nasce dentro de você.");
        frases.add("Não compense na ira o que lhe falta na razão.");
        frases.add("Defeitos e virtudes são apenas dois lados da mesma moeda.");
        frases.add("A maior de todas as torres começa no solo.");
        frases.add("Não há que ser forte. Há que ser flexível.");
        frases.add("Gente todo dia arruma os cabelos, por que não o coração?");
        frases.add("Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.");
        frases.add("A juventude não é uma época da vida, é um estado de espírito.");
        frases.add("Podemos escolher o que semear, mas somos obrigados a colher o que plantamos.");
    }

    public void getFrase(View view){
        Random r = new Random();
        int index = r.nextInt(10);

        TextView lucky = findViewById(R.id.lucky);

        lucky.setText("Sua frase do dia é: " + this.frases.get(index));
    }
}
