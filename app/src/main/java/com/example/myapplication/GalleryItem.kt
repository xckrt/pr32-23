package com.example.myapplication

import com.google.gson.annotations.SerializedName

data class GalleryItem(var title: String = "",
var id: String = "", @SerializedName("url_s") var url: String = "")
