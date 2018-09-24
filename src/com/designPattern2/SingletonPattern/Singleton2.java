package com.designPattern2.SingletonPattern;

/**
 * @ClassName: Singleton2
 * @Description: 懒汉式，线程安全
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 11:28
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}
    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("hello singleton2");
    }
}
