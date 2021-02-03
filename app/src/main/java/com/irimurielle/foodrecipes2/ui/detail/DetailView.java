package com.irimurielle.foodrecipes2.ui.detail;

import android.view.View;

import com.irimurielle.foodrecipes2.models.Meals;

public interface DetailView extends View.OnClickListener {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meals);
    void onErrorLoading(String message);
}
