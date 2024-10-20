package com.example.myapplication.api

import android.content.ContentValues.TAG
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import androidx.annotation.WorkerThread
import com.example.myapplication.FlickrResponce
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList" + "&api_key=057fa34b6b61fc98bd89e9188ff687a6" + "&format=json" +
    "&nojsoncallback=1" + "&extras=url_s")
    fun fetchPhotos(): Call<FlickrResponce>

    @GET
    fun fetchUrlBytes(@Url url: String):Call<ResponseBody>

    @WorkerThread
    fun fetchPhoto(url: String): Bitmap? {
        val response: Response<ResponseBody> = fetchUrlBytes(url).execute()
        val bitmap = response.body()?.byteStream()?.use(BitmapFactory::decodeStream)

        Log.i(TAG, "Decoded bitmap=$bitmap from Response =$response")
        return bitmap
    }
}