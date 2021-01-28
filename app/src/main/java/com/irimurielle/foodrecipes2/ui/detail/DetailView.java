package com.irimurielle.foodrecipes2.ui.detail;

import com.irimurielle.foodrecipes2.models.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meals);
    void onErrorLoading(String message);
}
