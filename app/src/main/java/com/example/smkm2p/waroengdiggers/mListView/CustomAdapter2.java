package com.example.smkm2p.waroengdiggers.mListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.smkm2p.waroengdiggers.R;
import com.example.smkm2p.waroengdiggers.mData.makanan2;

import java.util.ArrayList;

public class CustomAdapter2 extends BaseAdapter {


    Context c;
    ArrayList<makanan2> makanan2s;
    LayoutInflater inflater;

    public CustomAdapter2(Context c, ArrayList<makanan2> makanan2s) {
        this.c = c;
        this.makanan2s = makanan2s;
    }

    @Override
    public int getCount() {
        return makanan2s.size();
    }

    @Override
    public Object getItem(int position) {
        return makanan2s.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null)
        {
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView = inflater.inflate(R.layout.customlayout,parent,false);
        }

        TextView textView = convertView.findViewById(R.id.namamakanan);
        ImageView imageView = convertView.findViewById(R.id.gambarmakan);

        final String s = makanan2s.get(position).getName();
        int i = makanan2s.get(position).getImage();

        textView.setText(s);
        imageView.setImageResource(i);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return convertView;
    }
}
