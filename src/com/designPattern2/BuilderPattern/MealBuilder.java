package com.designPattern2.BuilderPattern;

/**
 * @ClassName: MealBuilder
 * @Description: 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 13:27
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VerBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal perpareChickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
