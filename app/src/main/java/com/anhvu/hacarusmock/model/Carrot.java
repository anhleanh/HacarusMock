package com.anhvu.hacarusmock.model;

/**
 * Created by leanh on 10/30/16.
 */

public class Carrot extends FoodDetail {

    @Override
    public void setValue(int unit) {
        calories = unit * 10;
        fats = unit * 15;
        carbs = unit * 20;
        protein = unit * 30;
        super.setChange();
    }
}
