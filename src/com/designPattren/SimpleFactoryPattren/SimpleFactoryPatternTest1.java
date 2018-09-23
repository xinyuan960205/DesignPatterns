package com.designPattren.SimpleFactoryPattren;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: SimpleFactoryPatternTest1
 * @Description: 多个方法的简单工厂模式的测试类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 16:10
 */
public class SimpleFactoryPatternTest1 {
    public static void main(String[] args){
        ShapeFactory1 shapeFactory1 = new ShapeFactory1();
        //获取Circle对象，并调用它的draw方法
        shape shape1 = shapeFactory1.drawCircle();
        shape1.draw();

        //获取Rectangle对象，并调用它的draw方法
        shape shape2 = shapeFactory1.drawRectangle();
        shape2.draw();
    }
}
