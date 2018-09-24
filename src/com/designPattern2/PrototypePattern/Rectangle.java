package com.designPattern2.PrototypePattern;

/**
 * @ClassName: Rectangle
 * @Description: 拓展抽象类的实体类
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 14:21
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    public void draw(){
        System.out.println("draw rectangle");
    }
}
