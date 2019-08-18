package com.example.jogoscapitais;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> estados, capitais;
    private String estado, capital;
    private int tries, acertos;
    private TextView pontuacao, estado_sorteado;
    private Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pontuacao = findViewById(R.id.pontuacao);

        estados = new ArrayList<String>();
        capitais = new ArrayList<String>();
        estados.add("RJ");
        estados.add("SP");
        estados.add("DF");
        estados.add("PR");
        estados.add("AC");
        estados.add("MT");
        estados.add("PA");
        estados.add("ES");
        estados.add("TO");
        estados.add("MG");

        capitais.add("Rio de Janeiro");
        capitais.add("Sao Paulo");
        capitais.add("Distrito Federal");
        capitais.add("Curitiba");
        capitais.add("Rio Branco");
        capitais.add("Cuiaba");
        capitais.add("Belem");
        capitais.add("Vitoria");
        capitais.add("Palmas");
        capitais.add("Belo Horizonte");

        r = new Random();
        int index = r.nextInt(10);
        estado = estados.get(index);
        capital = capitais.get(index);

        estado_sorteado = findViewById(R.id.estado_sorteado);
        estado_sorteado.setText(estado);

        acertos = 0;
        tries = 0;

    }

    public void responder(View view){
        EditText resposta = findViewById(R.id.resposta);
        String capital_resposta = resposta.getText().toString();

        if (capital_resposta.length() > 0) {
            this.tries++;
            if(this.tries <= 5) {
                resposta.setText("");
                if (this.capital.equalsIgnoreCase(capital_resposta)) {
                    Toast.makeText(MainActivity.this, "Acertou!!!", Toast.LENGTH_LONG).show();
                    this.acertos++;
                    this.pontuacao.setText("Sua pontuação é: " + acertos);
                } else {
                    Toast.makeText(MainActivity.this, "Errou", Toast.LENGTH_LONG).show();
                }
                int index = this.r.nextInt(10);
                this.estado = this.estados.get(index);
                this.capital = this.capitais.get(index);
                this.estado_sorteado.setText(this.estado);
            } else {
                Button button_responder = findViewById(R.id.responder);
                button_responder.setEnabled(false);
            }
        } else {
            Toast.makeText(MainActivity.this, "Preencha o campo", Toast.LENGTH_LONG).show();
        }

    }
}
