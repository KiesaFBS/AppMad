package com.example.gabri.madtorneio;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TesteActivity extends AppCompatActivity {

    private TextInputEditText campoTorneio;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);

        campoTorneio = findViewById(R.id.nomeTorneio); //referenciando o nome torneio
        resultado = findViewById(R.id.Resultado); //referenciando o resultado
    }

    public void btCadastro(View view){
        String nProduto = campoTorneio.getText().toString(); //converte o que está escrito no nome torneio para um string
        resultado.setText(nProduto);
    }
}
