package com.masai.basiscards.model.remote.data


import com.google.gson.annotations.SerializedName

data class ResponceDTO(
    @SerializedName("data")
    val `data`: List<Data>
)