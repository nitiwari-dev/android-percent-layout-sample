package com.code2concept.percent_layout_sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.code2concept.percent_layout_sample.adapter.PercentAdapter;
import com.code2concept.percent_layout_sample.model.PercentModel;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private RecyclerView percentRecyclerView;
    private String percentArray[] = new String[]{
            "20-50",
            "50-50",
            "50-100",
            "Tile 1",
            "Tile 2"
    };

    private List<PercentModel> percentModelsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        percentRecyclerView = (RecyclerView)findViewById(R.id.percentList);
        percentRecyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);
        percentRecyclerView.setLayoutManager(linearLayoutManager);

        fillList();
        PercentAdapter percentAdapter = new PercentAdapter(this,percentModelsList);
        percentRecyclerView.setAdapter(percentAdapter);


    }

    private void fillList() {
        for(String percent :percentArray){
            percentModelsList.add( new PercentModel(percent));
        }
    }
}
