package com.example.gyk_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProfilAnasayfa extends AppCompatActivity {

   // String [] takipcilerim = {"Bila","Ahmet","Mehmet","Hasan","Mehmet","Gamze"};
    ListView listTakipciler;
    TextView kulAdi,takipciSayisi;

    ArrayList<Kisi> kisiler = new ArrayList<>() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_anasayfa);

        listTakipciler = findViewById(R.id.listeTakipci);
        kulAdi = findViewById(R.id.edtKulAdi);
        takipciSayisi = findViewById(R.id.tvTakipciSayisi);

        kulAdi.setText(getIntent().getStringExtra("kullanici"));

        kisiler.add(new Kisi("Bilal",R.drawable.turkcelllogo,"Karaman"));
        kisiler.add(new Kisi("Bilal",R.drawable.ic_help_black_24dp,"Manisa"));
        kisiler.add(new Kisi("Bilal",R.drawable.ic_account_circle_black_24dp,"İzmir"));
        kisiler.add(new Kisi("Bilal",R.drawable.turkcelllogo,"İzmir"));
        kisiler.add(new Kisi("Bilal",R.drawable.turkcelllogo,"İzmir"));
        kisiler.add(new Kisi("Bilal",R.drawable.turkcelllogo,"İzmir"));
        kisiler.add(new Kisi("Bilal",R.drawable.turkcelllogo,"İzmir"));
        kisiler.add(new Kisi("Bilal",R.drawable.turkcelllogo,"İzmir"));
        kisiler.add(new Kisi("Bilal",R.drawable.turkcelllogo,"İzmir"));
        kisiler.add(new Kisi("Bilal",R.drawable.turkcelllogo,"İzmir"));
        kisiler.add(new Kisi("Bilal",R.drawable.turkcelllogo,"İzmir"));
        kisiler.add(new Kisi("Bilal",R.drawable.turkcelllogo,"İzmir"));


        Adapter adapter = new Adapter(this,kisiler);

        listTakipciler.setAdapter(adapter);

        takipciSayisi.setText(String.valueOf(kisiler.size()));




    }
}
