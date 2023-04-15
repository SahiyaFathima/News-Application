package com.example.newsapplication

import com.google.gson.annotations.SerializedName


data class Articles (

    @SerializedName("title"       ) var title       : String? = null,
    @SerializedName("description" ) var description : String? = null,
    @SerializedName("urlToImage"  ) var urlToImage  : String? = null,

    )