package com.selvaganesh.wekancodeinterviewtask.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import com.selvaganesh.wekancodeinterviewtask.app.AppController


object NetworkUtils {


    fun isNetworkAvailable(): Boolean {
        val cm = AppController.instance.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        return activeNetwork?.isConnected ==true
    }
}