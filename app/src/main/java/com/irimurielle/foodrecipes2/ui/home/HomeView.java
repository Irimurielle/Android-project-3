package com.irimurielle.foodrecipes2.ui.home;

import com.irimurielle.foodrecipes2.models.Categories;
import com.irimurielle.foodrecipes2.models.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
