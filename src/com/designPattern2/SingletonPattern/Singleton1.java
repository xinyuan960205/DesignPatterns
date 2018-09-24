package com.designPattern2.SingletonPattern;

/**
 * @ClassName: Singleton1
 * @Description: 懒汉式，线程不安全
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 11:18
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("hello singleton1");
    }
}
