package com.irimurielle.foodrecipes2.ui.category;

import com.irimurielle.foodrecipes2.models.Meals;

import java.util.List;

public interface CategoryView {
    void showLoading();
    void hideLoading();
    void setMeals(List<Meals.Meal> meals);
    void onErrorLoading(String message);
}
