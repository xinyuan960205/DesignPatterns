package com.designPattren1.AbstractFactoryPattern;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: Blue
 * @Description: 抽象工厂模式，color接口的实体类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 17:20
 */
public class Blue implements Color{
    public void fill(){
        System.out.println("color is blue");
    }
}
