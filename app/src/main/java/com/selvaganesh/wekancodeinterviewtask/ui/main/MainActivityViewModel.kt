package com.selvaganesh.wekancodeinterviewtask.ui.main

import android.annotation.SuppressLint
import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.selvaganesh.wekancodeinterviewtask.base.BaseViewModel
import com.selvaganesh.wekancodeinterviewtask.response.fuelstations.FuelStationResponse
import com.selvaganesh.wekancodeinterviewtask.utils.RxJavaUtils

@SuppressLint("CheckResult")
class MainActivityViewModel() : BaseViewModel() {

    private var TAG = this::class.java.simpleName
    private var context: Context? = null
    internal var getFuelStationMLD: MutableLiveData<FuelStationResponse>? = null

    internal fun setContext(mainActivity: Context) {
        this.context = mainActivity
    }

    init {
        getFuelStationMLD = MutableLiveData()
    }

    fun fetchApi(apiKey: String, fuelType: String, state: String, limit: String) {
        repo?.postDetails(apiKey, fuelType, state, limit)
            ?.compose(RxJavaUtils.applyObserverbleScheduler())
            ?.doOnSubscribe { showLoading(context, "") }
            ?.doOnTerminate { hideLoading() }
            ?.subscribe({ response ->
                getFuelStationMLD?.value = response
                hideLoading()
            }, { thowable ->
                getFuelStationMLD?.value = null
                hideLoading()
                exceptionHandling(thowable)
            })
    }


}