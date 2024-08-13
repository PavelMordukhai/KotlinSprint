package org.example.lesson_11

class RecipeCategory(
    val categoryId: Int,
    val categoryTitle: String,
    val categoryImageUrl: String,
    val categoryName: String,
    val categoryDescription: String,
) {
    fun printCategoryInfo() {
        println(categoryName)
        println(categoryDescription)
    }
}


class Recipe(
    val recipeId: Int,
    val recipeTitle: String,
    val recipeImageUrl: String,
    val dishName: String,
    val ingredients: MutableList<String>,
    val cookingMethod: String,
) {
    private var inFavorites: Boolean = false

    fun addToFavorites() {
        inFavorites = true
    }

    fun removeFromFavorites() {
        inFavorites = false
    }

    fun printCookingMethod() {
        println(cookingMethod)
    }
}


class Ingredient(
    val ingredientName: String,
    val amountPerServing: Int,
    val numberOfServings: Int,
) {
    fun countOnSeveralServings(numberOfServings: Int): Int {
        return amountPerServing * numberOfServings
    }
}

