package com.t0rn4d0.photoapp.feature.api

import com.t0rn4d0.photoapp.feature.models.PhotoList
import kotlinx.android.synthetic.main.activity_main.view.*
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by t0rn4d0 on 02/01/18.
 */
class PhotoRetriever {
    private val service: PhotoAPI

    init {
        val retrofit = Retrofit.Builder().
                baseUrl("https://pixabay.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        service=retrofit.create(PhotoAPI::class.java)
    }

    fun getPhotos(callback: Callback<PhotoList>){
        val call =service.getPhotos()
        call.enqueue(callback)
    }
}