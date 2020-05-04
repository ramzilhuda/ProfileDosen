package com.example.profiledosen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMylist(){

        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();

        m.setTittle("Ramzil Huda");
        m.setDescription("Saya adalah Seorang Dosen Programer");
        m.setImg(R.drawable.ic_ramzil);
        models.add(m);

        m = new Model();
        m.setTittle("Yulistya Rifiyanti");
        m.setDescription("Saya adalah Seorang Dosen Bahasa Indonesia");
        m.setImg(R.drawable.ic_tya);
        models.add(m);

        m = new Model();
        m.setTittle("Haikal Arsenio");
        m.setDescription("Saya adalah Seorang Dosen Teknik Sipil");
        m.setImg(R.drawable.ic_haikal);
        models.add(m);

        m = new Model();
        m.setTittle("Zainur Rahman");
        m.setDescription("Saya adalah Seorang Dosen Automotiv");
        m.setImg(R.drawable.ic_iin);
        models.add(m);



        return models;
    }

}
