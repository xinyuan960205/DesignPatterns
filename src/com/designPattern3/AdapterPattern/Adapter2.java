package com.designPattern3.AdapterPattern;

/**
 * @ClassName: Adapter2
 * @Description: 对象的适配器模式
 * @Author: xinyuan
 * @CreateDate: 2018/9/25 16:29
 */
public class Adapter2 implements Targetable{
    private Source source;

    public Adapter2(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is Targetable method");
    }
}
