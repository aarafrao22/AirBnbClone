package com.aarafrao.airbnb

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class citiesRvAdapter(
    var list: List<citiesModel>,
    val context: Context
) : RecyclerView.Adapter<citiesRvAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imageView: ImageView = itemView.findViewById(R.id.imgCity)

        //        var imageBg:ImageView = itemView.findViewById(R.id.bgItem)
        var txtCity: TextView = itemView.findViewById(R.id.txtCity)
        var txtDst: TextView = itemView.findViewById(R.id.txtDst)

        fun setData(city: String?, image: Int, dst: String?) {
            this.imageView.setImageResource(image)
            this.txtCity.text = city
            this.txtDst.text = dst
            itemView.setOnClickListener {
                Toast.makeText(context, "ItemViewClicked", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.cityitem, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(
            list[position].cityName,
            list[position].cityImage,
            list[position].cityDistance
        )
    }
}