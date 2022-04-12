package com.aarafrao.airbnb

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.Shader.TileMode
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item= ArrayList<citiesModel>()
        item.add(citiesModel(R.drawable.image,"Karachi","5 kilometer away"))
        item.add(citiesModel(R.drawable.image,"Hyderabad","144 kilometer away"))
        item.add(citiesModel(R.drawable.image,"Sukkur","363 kilometer away"))
        item.add(citiesModel(R.drawable.image,"Khairpur","341 kilometer away"))


        val adapter:citiesRvAdapter = citiesRvAdapter(item,this)
        rvCities.adapter =adapter
        rvCities.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        adapter.notifyDataSetChanged()



    }
}