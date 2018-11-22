package com.example.smkm2p.waroengdiggers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class menuminuman extends AppCompatActivity {

    List<makanan> minumanList;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuminuma);

        ListView list = (ListView) findViewById(R.id.listminuman);

        minumanList = new ArrayList<>();

        minumanList.add(new makanan(R.drawable.strawbery, "Strawbery Legend"));

        CustomAdapter Customadapter = new CustomAdapter(this, R.layout.customlayout, minumanList);
        list.setAdapter(Customadapter);



    }
}
