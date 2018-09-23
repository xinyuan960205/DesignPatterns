package com.designPattren.FactoryPattern;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: DrawCircleFactory
 * @Description: 工厂方法模式，工厂实体类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 16:45
 */
public class DrawCircleFactory implements ShapeFactory{
    @Override
    public shape drawShape(){
        return new Circle();
    }
}
