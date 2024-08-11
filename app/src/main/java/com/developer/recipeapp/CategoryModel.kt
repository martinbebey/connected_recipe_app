package com.developer.recipeapp

data class Category(
    var idCategory: String,
    var strCategory: String,
    var strCategoryThumb: String,
    var strCategoryDescription: String
)


data class CategoriesResponse(val categories: List<Category>) //variable must be exact same name as the response header