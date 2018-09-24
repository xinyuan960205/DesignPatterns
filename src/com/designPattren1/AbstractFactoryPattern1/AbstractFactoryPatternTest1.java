package com.designPattren1.AbstractFactoryPattern1;

/**
 * @ClassName: AbstractFactoryPatternTest1
 * @Description: 测试类
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 9:50
 */
public class AbstractFactoryPatternTest1 {
    public static void main(String[] args){
        PcFactory pcFactory = new DellFactory();
        Keybo keybo = pcFactory.createKeybo();
        keybo.sayHi();
        Mouse mouse = pcFactory.createMouse();
        mouse.sayHi();

        PcFactory pcFactory1 = new HpFactory();
        Keybo keybo1 = pcFactory1.createKeybo();
        keybo1.sayHi();
        Mouse mouse1 = pcFactory1.createMouse();
        mouse1.sayHi();
    }
}
