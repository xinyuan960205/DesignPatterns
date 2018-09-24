package com.designPattren1.AbstractFactoryPattern1;

/**
 * @ClassName: PcFactory
 * @Description: 工厂类接口
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 9:45
 */
public interface PcFactory {
    public Mouse createMouse();
    public Keybo createKeybo();
}
