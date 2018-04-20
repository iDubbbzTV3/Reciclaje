package com.ecalles.reciclaje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        series = new ArrayList<>();
        rv= findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager=new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareSeries();

        adapter=new SeriesAdapter(series);
        rv.setAdapter(adapter);
    }

    public void prepareSeries(){
        String AG = "Mensaje";
        series = new ArrayList<>();
        series.add(new Serie("Breaking Bad", "13", R.drawable.miku, "whatever"));
        series.add(new Serie("Breaking Bad again", "13", R.drawable.miku, "whatever"));
        series.add(new Serie("Breaking Bad one more time", "13", R.drawable.miku, "whatever"));

    }
}
