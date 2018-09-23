package com.designPattren.AbstractFactoryPattern;

import com.designPattren.AbstractFactoryPattern.shape;

/**
 * @ProjectName: Factory_Pattern
 * @ClassName: ShapeFactory
 * @Description: 工厂类的接口
 * @Author: xinyuan
 * @CreateDate: 2018/9/23 16:43
 */
public interface ShapeFactory {
    public shape drawShape();
    public Color drawColor();
}
