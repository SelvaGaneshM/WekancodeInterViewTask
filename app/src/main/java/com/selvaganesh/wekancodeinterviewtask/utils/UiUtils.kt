package com.selvaganesh.wekancodeinterviewtask.utils

import android.app.ProgressDialog
import android.content.Context
import android.util.Log
import android.widget.Toast

object UiUtils {

    fun showLoadingDialog(context: Context?, message: String?): ProgressDialog {
        var progressDialog = ProgressDialog(context)
        progressDialog.setMessage(message)
        return progressDialog
    }

    fun showToast(context: Context, msg: String?) {
        Toast.makeText(context, "" + msg, Toast.LENGTH_SHORT).show()
    }

    fun errorLog(TAG: String?, msg: String?) {
        Log.e(TAG, msg)
    }
}
