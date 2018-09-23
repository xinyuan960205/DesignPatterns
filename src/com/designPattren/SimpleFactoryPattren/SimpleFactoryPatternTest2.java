package com.designPattren.SimpleFactoryPattren;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: SimpleFactoryPatternTest2
 * @Description: 多个静态方法的简单工厂模式的测试类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 16:19
 */
public class SimpleFactoryPatternTest2 {
    public static void main(String[] args){
        shape circle = ShapeFactory2.drawCircle();
        circle.draw();

        shape rectangle = ShapeFactory2.drawRectangle();
        rectangle.draw();
    }
}
