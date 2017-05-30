package com.rafaelarnosti.hungry4pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void logar(){
            Intent intent = new Intent(LoginActivity.this,
                    PedidoActivity.class);
            startActivity(intent);
        LoginActivity.this.finish();
    }
}
