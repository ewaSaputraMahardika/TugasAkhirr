package com.example.smkm2p.waroengdiggers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class menumakanan extends AppCompatActivity {

    List<makanan> makananList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menumakanan);

        ListView listView = (ListView) findViewById(R.id.listmakanan);

        makananList = new ArrayList<>();

        makananList.add(new makanan(R.drawable.bebekpeking, "Bebek Peking"));
        makananList.add(new makanan(R.drawable.cahkangkung, "Cah Kangkung"));
        makananList.add(new makanan(R.drawable.guramebakar, "Gurame Bakar"));
        makananList.add(new makanan(R.drawable.kakap, "Kakap  the best"));

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.customlayout, makananList);
        listView.setAdapter(customAdapter);

    }
}
