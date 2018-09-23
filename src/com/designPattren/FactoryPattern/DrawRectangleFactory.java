package com.designPattren.FactoryPattern;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: DrawRectangleFactory
 * @Description: 工厂方法模式，工厂实体类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 16:46
 */
public class DrawRectangleFactory implements ShapeFactory{
    public shape drawShape(){
        return new Rectangle();
    }
}
