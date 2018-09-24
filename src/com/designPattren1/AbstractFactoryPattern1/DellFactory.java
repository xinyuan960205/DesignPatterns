package com.designPattren1.AbstractFactoryPattern1;

/**
 * @ClassName: DellFactory
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 9:46
 */
public class DellFactory implements PcFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new DellKeybo();
    }
}
