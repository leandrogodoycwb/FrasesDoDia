package com.github.leandrogodoycwb.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "A persistência é o caminho do êxito.",
                "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo." +
                        " Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis.",
                "Determinação, coragem e autoconfiança são fatores decisivos para o sucesso. Se estamos possuídos por uma inabalável determinação, conseguiremos superá-los." +
                        " Independentemente das circunstâncias, devemos ser sempre humildes, recatados e despidos de orgulho.",
                "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas acima de tudo, seja você sempre."
        };
        int numero = new Random().nextInt(4); //0 1 2 3

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[numero] );
    }

}
