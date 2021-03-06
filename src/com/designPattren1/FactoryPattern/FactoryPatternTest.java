package com.designPattren1.FactoryPattern;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: FactoryPatternTest
 * @Description: 工厂方法模式测试类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 16:47
 */
public class FactoryPatternTest {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new DrawCircleFactory();
        shape circle = shapeFactory.drawShape();
        circle.draw();

        ShapeFactory shapeFactory1 = new DrawRectangleFactory();
        shape rectangle = shapeFactory1.drawShape();
        rectangle.draw();
    }
}
