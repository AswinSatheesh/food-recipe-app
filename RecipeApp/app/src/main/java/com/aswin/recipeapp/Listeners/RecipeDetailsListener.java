package com.aswin.recipeapp.Listeners;

import com.aswin.recipeapp.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFeth(RecipeDetailsResponse response, String message);
    void didError(String message);
}
