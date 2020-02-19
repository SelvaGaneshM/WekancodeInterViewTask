package com.selvaganesh.wekancodeinterviewtask.base

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun showError(message: String)
}