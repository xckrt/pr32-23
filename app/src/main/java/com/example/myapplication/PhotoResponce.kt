package com.example.myapplication

import com.google.gson.annotations.SerializedName

class PhotoResponce {
    @SerializedName ("photo") lateinit var galleryItems: List<GalleryItem>
}