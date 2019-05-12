package com.ufjf.dcc196.melhoridade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CADASTRO = 1;
    private static final int REQUEST_LOGIN = 1;

    private Button btnLogin;
    private Button btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btn_Login);
        btnCadastro = (Button) findViewById(R.id.btn_Cadastro);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CadastroIdosoActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_CADASTRO);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivityForResult(intent, MainActivity.REQUEST_LOGIN);
            }
        });
    }
}
