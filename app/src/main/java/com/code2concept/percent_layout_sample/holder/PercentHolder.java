package com.code2concept.percent_layout_sample.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.code2concept.percent_layout_sample.R;

/**
 * Created by nitesh on 8/30/2015.
 */
public class PercentHolder extends RecyclerView.ViewHolder {

    public TextView percentTv;

    public PercentHolder(View itemView) {
        super(itemView);

        percentTv = (TextView) itemView.findViewById(R.id.percent_tv);
    }
}
