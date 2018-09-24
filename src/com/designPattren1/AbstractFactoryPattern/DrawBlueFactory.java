package com.designPattren1.AbstractFactoryPattern;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: DrawBlueFactory
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 17:30
 */
public class DrawBlueFactory implements ShapeFactory{
    @Override
    public shape drawShape(){
        return null;
    }

    @Override
    public Color drawColor(){
        return new Blue();
    }
}
