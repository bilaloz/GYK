package com.example.gyk_project;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {

    Context context ;
    ArrayList<Kisi> kisilerim;

    public Adapter(Context context, ArrayList<Kisi> kisilerim) {
        this.context = context;
        this.kisilerim = kisilerim;
    }

    @Override
    public int getCount() {
        return kisilerim.size();
    }

    @Override
    public Object getItem(int position) {
        return kisilerim.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(context,R.layout.row,null) ;

        ImageView image = v.findViewById(R.id.kulImg);
        image.setImageResource(kisilerim.get(position).getResmi());
        TextView textView = v.findViewById(R.id.kulAdi);
        textView.setText(kisilerim.get(position).getAdi());
        TextView txtAciklama = v.findViewById(R.id.txtAciklama);
        txtAciklama.setText(kisilerim.get(position).getAciklama());


        return v;
    }
}
