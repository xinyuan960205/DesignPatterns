package com.designPattern2.BuilderPattern;

/**
 * @ClassName: Burger
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 12:33
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

//    @Override
//    public abstract float price();
}
