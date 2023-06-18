package com.example.stardewvalley;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class animais extends AppCompatActivity {

    private Button botaoWeb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais);

        botaoWeb = (Button) findViewById(R.id.button_site2);

        botaoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.stardewvalleywiki.com/Animais")));
            }
        });
    }
    public void MainActivity(View view) {
        Intent in = new Intent(animais.this, MainActivity.class);
        startActivity(in);
    }
}