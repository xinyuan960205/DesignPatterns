package com.designPattern3.AdapterPattern;

/**
 * @ClassName: Adapter
 * @Description: 类的适配器
 * @Author: xinyuan
 * @CreateDate: 2018/9/25 16:15
 */
public class Adapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("this is Targetable method");
    }
}
