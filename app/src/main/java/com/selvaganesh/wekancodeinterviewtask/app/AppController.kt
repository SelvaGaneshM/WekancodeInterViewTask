package com.selvaganesh.wekancodeinterviewtask.app

import android.app.Application
import com.selvaganesh.wekancodeinterviewtask.dagger.AppComponent
import com.selvaganesh.wekancodeinterviewtask.dagger.AppModule
import com.selvaganesh.wekancodeinterviewtask.dagger.DaggerAppComponent


class AppController : Application() {


    override fun onCreate() {
        super.onCreate()
        instance=this
        Injector = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    companion object {
        lateinit var instance: AppController
        internal lateinit var Injector: AppComponent

    }


}


