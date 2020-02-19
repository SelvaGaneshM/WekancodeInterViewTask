package com.selvaganesh.wekancodeinterviewtask.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.selvaganesh.wekancodeinterviewtask.app.AppController
import com.selvaganesh.wekancodeinterviewtask.app.AppPreference
import javax.inject.Inject

open class BaseActivity : AppCompatActivity() {

    @set:Inject
    internal var preference: AppPreference? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.Injector.inject(this)
        setInstance()
    }

    private fun setInstance() {
    }
}