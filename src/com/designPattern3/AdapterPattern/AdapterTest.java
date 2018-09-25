package com.designPattern3.AdapterPattern;

/**
 * @ClassName: AdapterTest
 * @Description: 类的适配器:测试
 * @Author: xinyuan
 * @CreateDate: 2018/9/25 16:17
 */
public class AdapterTest {
    public static void main(String[] args){
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
