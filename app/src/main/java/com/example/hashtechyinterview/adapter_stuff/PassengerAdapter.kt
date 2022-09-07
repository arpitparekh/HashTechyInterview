package com.example.hashtechyinterview.adapter_stuff

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hashtechyinterview.DataItem
import com.example.hashtechyinterview.databinding.PassengerRowItemBinding

class PassengerAdapter(val list: ArrayList<DataItem?>?,val context : Context) : RecyclerView.Adapter<PassengerAdapter.PassengerViewHolder>() {

    class PassengerViewHolder(val binding : PassengerRowItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PassengerViewHolder {
        val binding = PassengerRowItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PassengerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PassengerViewHolder, position: Int) {

        val dataItem = list?.get(position)

        holder.binding.dataItem = dataItem

        holder.binding.airline = dataItem?.airline?.get(0)

        Glide.with(context).load(dataItem?.airline?.get(0)?.logo).into(holder.binding.ivAirLines);


    }

    override fun getItemCount(): Int = list!!.size
}