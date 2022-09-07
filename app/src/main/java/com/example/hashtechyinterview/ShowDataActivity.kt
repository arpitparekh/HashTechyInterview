package com.example.hashtechyinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hashtechyinterview.adapter_stuff.PassengerAdapter
import com.example.hashtechyinterview.databinding.ActivityShowDataBinding
import com.example.hashtechyinterview.viewmodel_stuff.PassengerViewModel

class ShowDataActivity : AppCompatActivity() {
    lateinit var binding : ActivityShowDataBinding
    lateinit var viewModel: PassengerViewModel
    var list : ArrayList<DataItem?>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()

        binding.rvPassenger.layoutManager = LinearLayoutManager(this)

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(
            PassengerViewModel::class.java)

        viewModel.apiCalling()

        viewModel.mutablePassengerLiveData.observe(this, Observer {

            list = it.data as ArrayList<DataItem?>?

            val adapter = PassengerAdapter(list,this)

            binding.rvPassenger.adapter = adapter

        })


    }
}