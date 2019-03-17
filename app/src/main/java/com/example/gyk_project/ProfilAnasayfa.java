package com.example.gyk_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ProfilAnasayfa extends AppCompatActivity {

    String [] takipcilerim = {"Bila","Ahmet","Mehmet","Hasan","Mehmet","Gamze"};
    ListView listTakipciler;
    TextView kulAdi,takipciSayisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_anasayfa);

        listTakipciler = findViewById(R.id.listeTakipci);
        kulAdi = findViewById(R.id.edtKulAdi);
        takipciSayisi = findViewById(R.id.tvTakipciSayisi);
        takipciSayisi.setText("Takipci Sayisi = "+String.valueOf(takipcilerim.length));

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,takipcilerim);
        listTakipciler.setAdapter(arrayAdapter);
    }
}
