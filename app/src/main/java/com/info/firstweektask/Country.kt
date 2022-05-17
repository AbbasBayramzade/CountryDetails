package com.info.firstweektask


import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("area")
    val area: Int,
    @SerializedName("capital")
    val capital: List<String>,
    @SerializedName("continents")
    val continents: List<String>,
    @SerializedName("fifa")
    val fifa: String,
    @SerializedName("flag")
    val flag: String,
    @SerializedName("flags")
    val flags: Flags,
    @SerializedName("name")
    val name: Name,
    @SerializedName("population")
    val population: Int,
    @SerializedName("region")
    val region: String,
    @SerializedName("subregion")
    val subregion: String
)