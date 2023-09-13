package com.example.family.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Member(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
