package com.example.recycleviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.animal_list_item.view.*

class Animal(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<Animal.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvAnimalType?.text = items.get(position)
    }




    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvAnimalType = view.tv_animal_type
    }



    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }
}
