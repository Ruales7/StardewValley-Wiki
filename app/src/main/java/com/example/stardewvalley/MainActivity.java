package com.example.stardewvalley;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoWeb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoWeb = (Button) findViewById(R.id.button_musicas);

        botaoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=FQSHcl6TJb4&list=PLKDOdCjxOjzIFucHobwJpSK4-vAVXST90")));
            }
        });
    }

    public void personagens(View view) {
        Intent in = new Intent(MainActivity.this, Personagens.class);
        startActivity(in);
    }

    public void animais(View view) {
        Intent in = new Intent(MainActivity.this, animais.class);
        startActivity(in);
    }

    public void locais(View view) {
        Intent in = new Intent(MainActivity.this, locais.class);
        startActivity(in);
    }

    public void estacoes(View view) {
        Intent in = new Intent(MainActivity.this, estacoes.class);
        startActivity(in);
    }

    public void eventos(View view) {
        Intent in = new Intent(MainActivity.this, eventos.class);
        startActivity(in);
    }
}