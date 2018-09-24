package com.designPattren1.AbstractFactoryPattern;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: DrawRedFactory
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 17:25
 */
public class DrawRedFactory implements ShapeFactory{
    @Override
    public shape drawShape(){
        return null;
    }

    @Override
    public Color drawColor(){
        return new Red();
    }
}
