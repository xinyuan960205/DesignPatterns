package com.designPattren1.AbstractFactoryPattern;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: Red
 * @Description: 抽象工厂模式，color接口的实体类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 17:18
 */
public class Red implements Color{
    @Override
    public void fill(){
        System.out.println("color is red");
    }
}
