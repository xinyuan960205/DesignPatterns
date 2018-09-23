package com.designPattren.SimpleFactoryPattren;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: ShapeFactory
 * @Description: 普通的简单工厂模式的工厂类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 16:06
 */
public class ShapeFactory {
    //使用一个getShape方法获取形状类型对象
    public shape getShape(String shapeType){
        if(shapeType == null){
            System.out.println("please enter right word:");
        }else if(shapeType.equals("circle")){
            return new Circle();
        }else if(shapeType.equals("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
