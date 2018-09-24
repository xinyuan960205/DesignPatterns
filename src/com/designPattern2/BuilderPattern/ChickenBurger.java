package com.designPattern2.BuilderPattern;

/**
 * @ClassName: ChickenBurger
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 13:14
 */
public class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "chickenbuger";
    }
}
