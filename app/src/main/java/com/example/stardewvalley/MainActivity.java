package com.example.stardewvalley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}