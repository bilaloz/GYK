package com.example.gyk_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnasayfaActivity extends AppCompatActivity {

    TextView tvName;
    String name, paswword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);

        name = getIntent().getStringExtra("name");
        paswword = getIntent().getStringExtra("password");

        tvName = findViewById(R.id.kullaniciAdi);
        tvName.setText(name);
    }
}
