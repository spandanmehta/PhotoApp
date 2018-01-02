package com.t0rn4d0.photoapp.feature.models

import java.io.Serializable

/**
 * Created by t0rn4d0 on 02/01/18.
 */
data class Photo(val id:String,
                 val likes:Int,
                 val favorites: Int,
                 val tags:String,
                 val previewURL:String,
                 val webformatURL:String):Serializable {
}