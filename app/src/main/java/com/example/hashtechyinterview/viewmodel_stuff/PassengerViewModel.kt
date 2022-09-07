package com.example.hashtechyinterview.viewmodel_stuff

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.hashtechyinterview.Passenger
import com.example.hashtechyinterview.api_stuff.ApiHelper
import com.example.hashtechyinterview.api_stuff.ApiInterface
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PassengerViewModel(application: Application) : AndroidViewModel(application) {

    var api: ApiInterface? = ApiHelper.getInstance()

    var mutablePassengerLiveData: MutableLiveData<Passenger> = MutableLiveData()


    @OptIn(DelicateCoroutinesApi::class)
    fun apiCalling(){

        GlobalScope.launch {

            val call = api?.getPassengerData(0,20)

            call?.enqueue(object : Callback<Passenger>{
                override fun onResponse(call: Call<Passenger>, response: Response<Passenger>) {

                    mutablePassengerLiveData.postValue(response.body())
                }

                override fun onFailure(call: Call<Passenger>, t: Throwable) {
                    Log.i("ApiError",t.message.toString())
                }


            })

        }
    }
}