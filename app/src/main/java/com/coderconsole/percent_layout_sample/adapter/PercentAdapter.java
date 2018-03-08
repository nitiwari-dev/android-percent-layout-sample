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

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
                showPercentDialog(position, percentModelList.get(position).percentType);
            }
        });
    }


    private void showPercentDialog(int position, String percentType) {

        switch (position) {


            case 0:
                createDialogByPosition(percentType, R.layout.row_constraint_percent_20_50);
                break;

            case 1:
                createDialogByPosition(percentType, R.layout.row_constraint_percent_50_50);
                break;

            case 2:
                createDialogByPosition(percentType, R.layout.row_constraint_percent_50_100);
                break;

            case 3:
                createDialogByPosition(percentType, R.layout.row_constraint_percent_tile1);
                break;

            case 4:
                createDialogByPosition(percentType, R.layout.row_constraint_percent_tile2);
                break;
            case 5:
                createDialogByPosition(percentType, R.layout.row_constraint_chainning_ratios);
                break;
        }


    }

    private void createDialogByPosition(String percentType, int resID) {

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(resID);
        dialog.setTitle(percentType);
        dialog.show();
    }


    @Override
    public int getItemCount() {
        return percentModelList.size();
    }
}
