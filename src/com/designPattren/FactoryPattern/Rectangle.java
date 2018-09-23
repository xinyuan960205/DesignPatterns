package com.designPattren.FactoryPattern;

/**
 * 简单工厂模式
 * 创建一个实现接口的实体类
 * Rectangle画一个矩形
 */
public class Rectangle implements shape {
    @Override
    public void draw(){
        System.out.println("draw a Rectangle");
    }
}
