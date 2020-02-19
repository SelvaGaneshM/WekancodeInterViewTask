package com.selvaganesh.wekancodeinterviewtask.response.fuelstations

import com.google.gson.annotations.SerializedName

data class FuelStationResponse(

	@field:SerializedName("station_locator_url")
	val stationLocatorUrl: String? = null,

	@field:SerializedName("fuel_stations")
	val fuelStations: ArrayList<FuelStationsItem>? = null,

	@field:SerializedName("total_results")
	val totalResults: Int? = null
)