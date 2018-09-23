package com.designPattren.AbstractFactoryPattern;

import com.designPattren.AbstractFactoryPattern.Rectangle;
import com.designPattren.AbstractFactoryPattern.shape;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: DrawRectangleFactory
 * @Description: 工厂方法模式，工厂实体类
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 16:46
 */
public class DrawRectangleFactory implements ShapeFactory {
    @Override
    public shape drawShape(){
        return new Rectangle();
    }

    @Override
    public Color drawColor(){
        return null;
    }
}
