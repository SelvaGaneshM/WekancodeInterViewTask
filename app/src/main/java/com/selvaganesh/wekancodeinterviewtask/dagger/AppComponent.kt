package com.selvaganesh.wekancodeinterviewtask.dagger


import com.selvaganesh.wekancodeinterviewtask.app.AppPreference
import com.selvaganesh.wekancodeinterviewtask.app.Repo
import com.selvaganesh.wekancodeinterviewtask.base.BaseActivity
import com.selvaganesh.wekancodeinterviewtask.base.BaseViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(baseActivity: BaseActivity)
    fun inject(baseViewModel: BaseViewModel)
    fun inject(repo: Repo)
    fun inject(preference: AppPreference)
}