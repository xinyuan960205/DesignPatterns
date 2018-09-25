package com.designPattern3.AdapterPattern;

/**
 * @ClassName: AdapterTest3
 * @Description: 接口的适配器模式:测试
 * @Author: xinyuan
 * @CreateDate: 2018/9/25 16:44
 */
public class AdapterTest3 {
    public static void main(String[] args){
        Targetable targetable = new SourceSub1();
        Targetable targetable1 = new SourceSub2();

        targetable.method1();
        targetable.method2();
        targetable1.method1();
        targetable1.method2();
    }
}
