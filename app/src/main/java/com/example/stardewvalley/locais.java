package com.example.stardewvalley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class locais extends AppCompatActivity {


    private Button botaoWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locais);

        botaoWeb = (Button) findViewById(R.id.button_site3);

        botaoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.stardewvalleywiki.com/Categoria:Locais")));
            }
        });
    }
    public void Locais(View view) {
        Intent in = new Intent(locais.this, MainActivity.class);
        startActivity(in);
    }
}