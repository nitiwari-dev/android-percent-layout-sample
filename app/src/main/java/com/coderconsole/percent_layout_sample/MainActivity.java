/*
 * Copyright (C) 2018 Nitesh Tiwari.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coderconsole.percent_layout_sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.coderconsole.percent_layout_sample.adapter.PercentAdapter;
import com.coderconsole.percent_layout_sample.model.PercentModel;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private RecyclerView percentRecyclerView;
    private String percentArray[] = new String[]{
            "20-50",
            "50-50",
            "50-100",
            "Tile 1",
            "Tile 2",
            "Chaining and Ratios"
    };

    private List<PercentModel> percentModelsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        percentRecyclerView = findViewById(R.id.percentList);
        percentRecyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);
        percentRecyclerView.setLayoutManager(linearLayoutManager);

        fillList();
        PercentAdapter percentAdapter = new PercentAdapter(this, percentModelsList);
        percentRecyclerView.setAdapter(percentAdapter);


    }

    private void fillList() {
        for (String percent : percentArray) {
            percentModelsList.add(new PercentModel(percent));
        }
    }
}
