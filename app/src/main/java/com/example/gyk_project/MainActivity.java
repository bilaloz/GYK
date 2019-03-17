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


    ListView listSehirler;

    String [] sehirler = {"İstanbul","Ankara","İzmir","Adana","Konya","Manisa","Karabük","Ağrı"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listSehirler = findViewById(R.id.listSehirler);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,sehirler);
        listSehirler.setAdapter(arrayAdapter);
        listSehirler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        "TIklanılan yer = "+sehirler[position],
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
