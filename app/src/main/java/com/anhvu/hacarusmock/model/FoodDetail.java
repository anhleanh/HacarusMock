package com.anhvu.hacarusmock.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.anhvu.hacarusmock.BR;

/**
 * Created by leanh on 10/19/16.
 */

public abstract class FoodDetail extends BaseObservable {

    protected String title;
    protected int calories;
    protected int fats;
    protected int carbs;
    protected int protein;


    public abstract void setValue(int unit);

    public void setChange() {
        notifyPropertyChanged(BR.calories);
        notifyPropertyChanged(BR.fats);
        notifyPropertyChanged(BR.carbs);
        notifyPropertyChanged(BR.protein);
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
        notifyPropertyChanged(BR.calories);
    }

    @Bindable
    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
        notifyPropertyChanged(BR.fats);
    }

    @Bindable
    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
        notifyPropertyChanged(BR.carbs);
    }

    @Bindable
    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
        notifyPropertyChanged(BR.protein);
    }
}
