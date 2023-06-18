package com.example.uts_mobile.ui.makanan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Makanan (
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0
)
    : Parcelable {
    companion object {
        const val EXTRA_MINUMAN = "extra_minuman"
    }
}