package com.t0rn4d0.photoapp.feature.api

import com.t0rn4d0.photoapp.feature.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by t0rn4d0 on 02/01/18.
 */
interface PhotoAPI {
    @GET("?key=7569940-936a1077307dcf4afa43a69d2&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}