package com.developer.recipeapp

data class Category(
    var idCategory: String,
    var strCategory: String,
    var strCategoryThumb: String,
    var strCategoryDescription: String
)


data class CategoriesResponse(val categoriesList: List<Category>)