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

package com.coderconsole.percent_layout_sample.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coderconsole.percent_layout_sample.DetailPercentActivity;
import com.coderconsole.percent_layout_sample.R;
import com.coderconsole.percent_layout_sample.holder.PercentHolder;
import com.coderconsole.percent_layout_sample.model.PercentModel;

import java.util.List;

public class PercentAdapter extends RecyclerView.Adapter<PercentHolder> {

    private final List<PercentModel> percentModelList;
    private Context context;

    public PercentAdapter(Context context, List<PercentModel> percentModelList) {
        this.percentModelList = percentModelList;
        this.context = context;
    }

    @Override
    public PercentHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.
                from(context).
                inflate(R.layout.row_percent_cardview, parent, false);


        return new PercentHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PercentHolder holder, final int position) {
        holder.percentTv.setText(percentModelList.get(position).percentType);
        holder.percentTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity(position);
            }
        });
    }


    private void startDetailActivity(int position) {

        int resID = 0;
        switch (position) {
            case 0:
                resID = R.layout.row_constraint_percent_20_50;
                break;
            case 1:
                resID = R.layout.row_constraint_percent_50_50;
                break;
            case 2:
                resID = R.layout.row_constraint_percent_50_100;
                break;
            case 3:
                resID = R.layout.row_constraint_percent_tile1;
                break;
            case 4:
                resID = R.layout.row_constraint_percent_tile2;
                break;
            case 5:
                resID = R.layout.row_constraint_chainning_ratios;
                break;
        }

        Intent intent = new Intent(context, DetailPercentActivity.class);
        intent.putExtra(DetailPercentActivity.EXTRAS_RES_ID, resID);
        context.startActivity(intent);


    }

    @Override
    public int getItemCount() {
        return percentModelList.size();
    }
}
