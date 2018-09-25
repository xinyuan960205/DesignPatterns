package com.designPattern3.AdapterPattern;

/**
 * @ClassName: AdapterTest2
 * @Description: java类作用描述
 * @Author: xinyuan
 * @CreateDate: 2018/9/25 16:33
 */
public class AdapterTest2 {
    public static void main(String[] args){
        Source source = new Source();
        Targetable targetable = new Adapter2(source);

        targetable.method1();
        targetable.method2();
    }
}
