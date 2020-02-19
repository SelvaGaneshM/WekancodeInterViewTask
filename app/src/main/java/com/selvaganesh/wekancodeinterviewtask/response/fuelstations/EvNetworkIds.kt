package com.selvaganesh.wekancodeinterviewtask.response.fuelstations

import com.google.gson.annotations.SerializedName

data class EvNetworkIds(

	@field:SerializedName("ports")
	val ports: List<String?>? = null,

	@field:SerializedName("posts")
	val posts: List<String?>? = null
)