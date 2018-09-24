package com.designPattern2.BuilderPattern;

/**
 * @ClassName: ColdDrink
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 13:11
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
