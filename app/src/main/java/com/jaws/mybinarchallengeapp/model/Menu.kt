package com.jaws.mybinarchallengeapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Menu(
    val menuImg: Int,
    val menuName: String,
    val menuPrice: String,
) : Parcelable