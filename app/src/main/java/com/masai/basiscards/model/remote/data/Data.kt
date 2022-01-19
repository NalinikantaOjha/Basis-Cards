package com.masai.basiscards.model.remote.data


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: String,
    @SerializedName("text")
    val text: String
)