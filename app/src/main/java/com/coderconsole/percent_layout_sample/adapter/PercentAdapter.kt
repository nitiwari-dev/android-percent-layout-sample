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

package com.coderconsole.percent_layout_sample.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.coderconsole.percent_layout_sample.BR
import com.coderconsole.percent_layout_sample.DetailPercentActivity
import com.coderconsole.percent_layout_sample.R
import com.coderconsole.percent_layout_sample.databinding.RowPercentCardviewBinding
import com.coderconsole.percent_layout_sample.holder.PercentHolder
import com.coderconsole.percent_layout_sample.model.PercentModel

class PercentAdapter(private val context: Context, private val percentModelList: List<PercentModel>) : RecyclerView.Adapter<PercentHolder>() {

    private val mLayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PercentHolder {
        val rowPercentCardViewBinding = RowPercentCardviewBinding.inflate(mLayoutInflater, parent, false)
        return PercentHolder(rowPercentCardViewBinding)
    }

    override fun onBindViewHolder(holder: PercentHolder, position: Int) {
        holder.itemViewBinding.setVariable(BR.model, percentModelList[position])
        holder.itemViewBinding.executePendingBindings()
        holder.itemViewBinding.percentTv.setOnClickListener { startDetailActivity(position) }
    }

    private fun startDetailActivity(position: Int) {

        var resID = 0
        when (position) {
            0 -> resID = R.layout.row_constraint_percent_20_50
            1 -> resID = R.layout.row_constraint_percent_50_50
            2 -> resID = R.layout.row_constraint_percent_50_100
            3 -> resID = R.layout.row_constraint_percent_tile1
            4 -> resID = R.layout.row_constraint_percent_tile2
            5 -> resID = R.layout.row_constraint_chainning_ratios
            6 -> resID = R.layout.row_constraint_background_view
        }

        val intent = Intent(context, DetailPercentActivity::class.java)
        intent.putExtra(DetailPercentActivity.EXTRAS_RES_ID, resID)
        context.startActivity(intent)
    }

    override fun getItemCount(): Int {
        return percentModelList.size
    }
}
