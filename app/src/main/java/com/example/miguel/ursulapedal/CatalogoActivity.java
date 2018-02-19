package com.example.miguel.ursulapedal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CatalogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
    }

    public void comprar1 (View v){
        Toast.makeText(this, "Se solicitó su pedido de Torta de chocolate", Toast.LENGTH_SHORT).show();
    }

    public void comprar2 (View v){
        Toast.makeText(this, "Se solicitó su pedido de Turrón", Toast.LENGTH_SHORT).show();
    }

    public void comprar3 (View v){
        Toast.makeText(this, "Se solicitó su pedido de Torta de fresas", Toast.LENGTH_SHORT).show();
    }
}
