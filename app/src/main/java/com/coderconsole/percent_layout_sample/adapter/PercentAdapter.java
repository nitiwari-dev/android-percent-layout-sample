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

/**
 * Created by nitesh on 8/30/2015.
 */
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
