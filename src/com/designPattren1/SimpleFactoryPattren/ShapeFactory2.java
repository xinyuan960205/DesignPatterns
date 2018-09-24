package com.designPattren1.SimpleFactoryPattren;

/**
 * @ProjectName: Factor_Pattern
 * @ClassName: ShapeFactory2
 * @Description: 多个静态方法的简单工厂模式的工厂类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 16:17
 */
public class ShapeFactory2 {
    public static shape drawCircle(){
        return new Circle();
    }

    public static shape drawRectangle(){
        return new Rectangle();
    }
}
