package com.example.stardewvalley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Personagens extends AppCompatActivity {

    private Button botaoWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagens);

        botaoWeb = (Button) findViewById(R.id.button_site);

        botaoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.stardewvalleywiki.com/Aldeões")));
            }
        });
    }
    public void personagens(View view) {
        Intent in = new Intent(Personagens.this, MainActivity.class);
        startActivity(in);
    }
}

