package com.example.hashtechyinterview.api_stuff

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiHelper {

    companion object{

        var api : ApiInterface? =null

        fun getInstance() : ApiInterface?{

            if(api ==null){

                val retrofit = Retrofit.Builder()
                    .baseUrl("https://api.instantwebtools.net/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                return retrofit.create(ApiInterface::class.java)

            }

            return api

        }

    }
}