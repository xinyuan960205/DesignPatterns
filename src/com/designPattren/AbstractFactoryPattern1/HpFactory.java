package com.designPattren.AbstractFactoryPattern1;

/**
 * @ClassName: HpFactory
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 9:48
 */
public class HpFactory implements PcFactory{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new HpKeybo();
    }
}
