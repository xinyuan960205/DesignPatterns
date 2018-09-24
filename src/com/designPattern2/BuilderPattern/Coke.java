package com.designPattern2.BuilderPattern;

/**
 * @ClassName: Coke
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 13:15
 */
public class Coke extends ColdDrink{
    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "coke";
    }
}
