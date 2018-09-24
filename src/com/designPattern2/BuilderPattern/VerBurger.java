package com.designPattern2.BuilderPattern;

/**
 * @ClassName: VerBurger
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 13:12
 */
public class VerBurger extends Burger{
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "VerBurger";
    }
}
