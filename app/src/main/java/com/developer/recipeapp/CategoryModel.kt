package com.developer.recipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    var idCategory: String,
    var strCategory: String,
    var strCategoryThumb: String,
    var strCategoryDescription: String
): Parcelable


data class CategoriesResponse(val categories: List<Category>) //variable must be exact same name as the response header