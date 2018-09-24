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

package com.coderconsole.percent_layout_sample

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import android.view.LayoutInflater
import com.coderconsole.percent_layout_sample.adapter.PercentAdapter
import com.coderconsole.percent_layout_sample.databinding.ActivityMainBinding
import com.coderconsole.percent_layout_sample.model.PercentModel


class MainActivity : AppCompatActivity() {


    private lateinit var mMainActivityMainBinding: ActivityMainBinding

    val percentArray = arrayOf("20-50", "50-50", "50-100", "Tile 1", "Tile 2", "Chaining and Ratios", "Backgrounds")

    var mPercentList = arrayListOf<PercentModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainActivityMainBinding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(mMainActivityMainBinding.root)

        init()
    }

    private fun init() {
        val percentRecyclerView = mMainActivityMainBinding.percentList
        percentRecyclerView.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(this, OrientationHelper.VERTICAL, false)
        percentRecyclerView.layoutManager = linearLayoutManager

        fillList()
        val percentAdapter = PercentAdapter(this, mPercentList)
        percentRecyclerView.adapter = percentAdapter
    }

    private fun fillList(){

        for (percent in percentArray) {
            mPercentList.add(PercentModel(percent))
        }

    }
}
