package com.ufjf.dcc196.melhoridade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastroIdosoActivity extends AppCompatActivity {

    private static final int REQUEST_SERVICOS = 1;

    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_idoso2);

        btnCadastrar= (Button) findViewById(R.id.btn_Cadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CadastroIdosoActivity.this, ListaServicosActivity.class);
                startActivityForResult(intent, CadastroIdosoActivity.REQUEST_SERVICOS);
            }
        });
    }
}
