package com.designPattren.SimpleFactoryPattren;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: ShapeFactory1
 * @Description: 多个方法的简单工厂模式的工厂类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 16:06
 */
public class ShapeFactory1 {
    public shape drawCircle(){
        return new Circle();
    }

    public shape drawRectangle(){
        return new Rectangle();
    }
}
