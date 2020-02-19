package com.selvaganesh.wekancodeinterviewtask.utils

object TextUtils {

    fun isEmpty(input: String?): Boolean {
        return input == null || input.trim { it <= ' ' }.isEmpty()
    }


    fun getString(input: Any?): String? {
        return if (input == null) "" else if (input.toString().trim { it <= ' ' } == "") "" else if (input.toString().trim { it <= ' ' }.equals(
                "null",
                ignoreCase = true
            )
        ) "" else input.toString().trim { it <= ' ' }
    }

}