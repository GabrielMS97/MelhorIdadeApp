package com.ufjf.dcc196.melhoridade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private static final int REQUEST_SERVICOS = 1;

    private Button btnLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogar= (Button) findViewById(R.id.btn_Logar);

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ListaServicosActivity.class);
                startActivityForResult(intent, LoginActivity.REQUEST_SERVICOS);
            }
        });
    }
}
