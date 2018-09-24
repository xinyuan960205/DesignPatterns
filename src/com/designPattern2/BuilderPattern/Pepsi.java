package com.designPattern2.BuilderPattern;

/**
 * @ClassName: Pepsi
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 13:16
 */
public class Pepsi extends ColdDrink{
    @Override
    public float price() {
        return 9.0f;
    }

    @Override
    public String name() {
        return "pepsi";
    }
}
