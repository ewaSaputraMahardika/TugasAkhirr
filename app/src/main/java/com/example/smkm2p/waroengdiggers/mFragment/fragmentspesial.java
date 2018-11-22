package com.example.smkm2p.waroengdiggers.mFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.smkm2p.waroengdiggers.R;
import com.example.smkm2p.waroengdiggers.mData.makanan2;
import com.example.smkm2p.waroengdiggers.mListView.CustomAdapter2;

import java.util.ArrayList;

public class fragmentspesial extends android.support.v4.app.Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View mview = inflater.inflate(R.layout.spesialfragment, container, false);

        ListView listView = mview.findViewById(R.id.mListspesial);
        CustomAdapter2 customAdapter2 = new CustomAdapter2(this.getActivity(), getspesial());
        listView.setAdapter(customAdapter2);
        return mview;
    }

    private ArrayList<makanan2> getspesial()
    {
        ArrayList<makanan2> makan = new ArrayList<>();

        makanan2 makan2 = new makanan2(R.drawable.strawbery, "ini bagian yang spesial Legend");
        makan.add(makan2);

        makan2 = new makanan2(R.drawable.guramebakar, "Gurame Bakar");
        makan.add(makan2);

        makan2 = new makanan2(R.drawable.bebekpeking, "Bebek Peking");
        makan.add(makan2);

        makan2 = new makanan2(R.drawable.bebekpeking, "Bebek Peking");
        makan.add(makan2);

        return  makan;
    }

    @Override
    public String toString() {
        return "Spesial";
    }
}
