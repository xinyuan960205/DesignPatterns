package com.designPattern2.PrototypePattern;

/**
 * @ClassName: Square
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 14:23
 */
public class Square extends Shape{
    public Square(){
        type = "square";
    }

    public void draw(){
        System.out.println("draw square");
    }
}
