package com.example.gyk_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText kulAdi,kulSifre;
    Button btnGiris,btnKayıtOl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kulAdi = findViewById(R.id.kulAdiEt);
        kulSifre = findViewById(R.id.sifreEdt);

        btnGiris=findViewById(R.id.btnGirisYap);
        btnKayıtOl=findViewById(R.id.btnKayit);


        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kulAdi.getText().toString().equals("bilal") && kulSifre.getText().toString().equals("1234")){
                    Intent i = new Intent(MainActivity.this,ProfilAnasayfa.class);
                    i.putExtra("kullanici",kulAdi.getText().toString());
                    startActivity(i);

                }
                else
                    Toast.makeText(MainActivity.this, "Kul adi veya şifre yanlış", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
