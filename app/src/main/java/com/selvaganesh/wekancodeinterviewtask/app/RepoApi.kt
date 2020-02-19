package com.selvaganesh.wekancodeinterviewtask.app

import com.selvaganesh.wekancodeinterviewtask.response.fuelstations.FuelStationResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RepoApi {

    @GET(ApiConstanct.GET_FUEL_STATIONS)
    fun getFuelStations(
        @Query("api_key") apiKey: String,
        @Query("fuel_type") fuelType: String,
        @Query("state") state: String,
        @Query("limit") limit: String
    ): Observable<FuelStationResponse>

}