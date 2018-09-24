package com.designPattern2.SingletonPattern;

/**
 * @ClassName: Singleton3
 * @Description: 饿汉式
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 11:37
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("hello singleton3");
    }
}
