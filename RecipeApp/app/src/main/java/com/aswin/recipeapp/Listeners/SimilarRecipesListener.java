package com.aswin.recipeapp.Listeners;

import com.aswin.recipeapp.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener {
    void didFectch(List<SimilarRecipeResponse> response, String message);
    void didError(String message);
}
