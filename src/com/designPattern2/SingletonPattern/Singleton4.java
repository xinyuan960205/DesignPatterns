package com.designPattern2.SingletonPattern;

/**
 * @ClassName: Singleton4
 * @Description: 双检锁/双重校验锁
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 11:47
 */
public class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class){
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("hello singleton4");
    }
}
