package com.example.smkm2p.waroengdiggers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<makanan> {

    Context context;
    int resource;
    List<makanan> makananList;

    public CustomAdapter (Context context, int resource, List<makanan> makananList) {
        super(context, resource, makananList);

        this.context = context;
        this.resource = resource;
        this.makananList = makananList;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(resource, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.gambarmakan);
        TextView textView = (TextView) view.findViewById(R.id.namamakanan);

        makanan makan = makananList.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(makan.getImage()));
        textView.setText(makan.getName());

        return view;
    }
}