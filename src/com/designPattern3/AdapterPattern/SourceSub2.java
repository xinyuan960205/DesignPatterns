package com.designPattern3.AdapterPattern;

/**
 * @ClassName: SourceSub2
 * @Description: 接口的适配器模式:Adapter抽象类的继承
 * @Author: xinyuan
 * @CreateDate: 2018/9/25 16:42
 */
public class SourceSub2 extends Adapter{
    @Override
    public void method2() {
        System.out.println("this is sourcesub2");
    }
}
