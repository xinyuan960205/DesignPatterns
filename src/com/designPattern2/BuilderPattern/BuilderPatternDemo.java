package com.designPattern2.BuilderPattern;

/**
 * @ClassName: BuilderPatternDemo
 * @Description: BuiderPatternDemo 使用 MealBuider 来演示建造者模式（Builder Pattern）。
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 13:31
 */
public class BuilderPatternDemo {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("veg meal");
        vegMeal.showItems();
        System.out.println("total cost:" + vegMeal.getCost());

        Meal chickMeal = mealBuilder.perpareChickenMeal();
        System.out.println("chick meal");
        chickMeal.showItems();
        System.out.println("total cost:" + chickMeal.getCost());
    }
}
