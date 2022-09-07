package com.example.hashtechyinterview

import com.google.gson.annotations.SerializedName

data class Passenger(

	@field:SerializedName("totalPassengers")
	val totalPassengers: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("totalPages")
	val totalPages: Int? = null
)

data class DataItem(

	@field:SerializedName("trips")
	val trips: Int? = null,

	@field:SerializedName("__v")
	val V: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("airline")
	val airline: List<AirlineItem?>? = null
)

data class AirlineItem(

	@field:SerializedName("established")
	val established: String? = null,

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("website")
	val website: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("head_quaters")
	val headQuaters: String? = null,

	@field:SerializedName("logo")
	val logo: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("slogan")
	val slogan: String? = null
)
