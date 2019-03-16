package com.example.gyk_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnGirisYap, btnKayitOl;
    EditText edtKullaniciAdi, edtSifre;
    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGirisYap = findViewById(R.id.btnGirisYap);
        btnKayitOl = findViewById(R.id.btnKayitOl);
        edtKullaniciAdi = findViewById(R.id.kullaniciAdi);
        edtSifre = findViewById(R.id.kullaniciSifre);
        imgLogo = findViewById(R.id.logo);

        btnGirisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (edtKullaniciAdi.equals("Bilal") && edtSifre.equals("1234")){
                   Intent i = new Intent(MainActivity.this, AnasayfaActivity.class);
                   i.putExtra("name", edtKullaniciAdi.getText());
                   i.putExtra("password", edtSifre.getText());

                   startActivity(i);

               }else {
                   Toast.makeText(MainActivity.this, "Kullanıcı adınız veya şifreniz yanlış!", Toast.LENGTH_SHORT).show();
               }
            }
        });

    }
}
