package com.example.shoesapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Shoes(
    var name: String = "",
    var desc: String = "",
    var size: String = "",
    var price: Double = 0.00,
    var pic: Int = 0
) : Parcelable