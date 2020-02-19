package com.selvaganesh.wekancodeinterviewtask.app

import com.selvaganesh.wekancodeinterviewtask.response.fuelstations.FuelStationResponse
import com.selvaganesh.wekancodeinterviewtask.utils.RxJavaUtils
import io.reactivex.Observable
import javax.inject.Inject

class Repo(val repoApi: RepoApi) {

    @Inject
    lateinit var preference: AppPreference

    init {
        AppController.Injector.inject(this)
    }


    fun postDetails(
        apiKey: String,
        fuelType: String,
        state: String,
        limit: String
    ): Observable<FuelStationResponse> {
        return repoApi.getFuelStations(apiKey, fuelType, state, limit)
            .compose(RxJavaUtils.applyErrorTransformer())
            .map { it }
    }


}