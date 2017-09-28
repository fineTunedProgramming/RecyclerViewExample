package com.demo.frame.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        //initialise adapter
        adapter = new Adapter(prepareList());  // prepareList will return a list and the adapter gets the list

        //set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));  //linear fashion

        //set adapter
        recyclerView.setAdapter(adapter);
    }


    public List<Model> prepareList(){
        List<Model> list = new ArrayList<>();

        list.add(new Model("Android 1.0\nApple Pie",R.drawable.a1));
        list.add(new Model("Android 1.1\nBanana Bread",R.drawable.a2));
        list.add(new Model("Android 1.5\nCupCake",R.drawable.a3));
        list.add(new Model("Android 1.6\nDonut",R.drawable.a4));
        list.add(new Model("Android 2.0\nEclair",R.drawable.a5));
        list.add(new Model("Android 2.2\nFroyo",R.drawable.a6));
        list.add(new Model("Android 2.3\nGinger Bread",R.drawable.a7));
        list.add(new Model("Android 3.0\nHoneycomb",R.drawable.a8));
        list.add(new Model("Android 4.0\nIcecream Sandwich",R.drawable.a9));
        list.add(new Model("Android 4.1/4.3\nJellyBean",R.drawable.a10));
        list.add(new Model("Android 4.4\nKitkat",R.drawable.a11));
        list.add(new Model("Android 5.0\nLollipop",R.drawable.a12));
        list.add(new Model("Android 6.0\nMarshmallow",R.drawable.a13));
        list.add(new Model("Android 7.0\nNougat",R.drawable.a14));
        list.add(new Model("Android 8.0\nOrieo",R.drawable.a15));

        return list;
    }
}
