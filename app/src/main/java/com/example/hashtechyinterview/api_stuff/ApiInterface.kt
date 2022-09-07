package com.example.hashtechyinterview.api_stuff

import com.example.hashtechyinterview.Passenger
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("v1/passenger")
    fun getPassengerData(@Query("page")page : Int,@Query("size")size : Int) : Call<Passenger>
}