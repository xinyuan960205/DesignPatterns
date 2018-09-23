package com.designPattren.SimpleFactoryPattren;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: SimpleFactoryPatternTest
 * @Description: 普通的简单工厂模式，用于进行测试
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 15:48
 */
public class SimpleFactoryPatternTest {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取Circle对象，并调用它的draw方法
        shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        //获取Rectangle对象，并调用它的draw方法
        shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

    }
}
