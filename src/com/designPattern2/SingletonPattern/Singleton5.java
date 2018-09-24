package com.designPattern2.SingletonPattern;

/**
 * @ClassName: Singleton5
 * @Description: 登记式/静态内部类
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 11:54
 */
public class Singleton5 {
    private static class SingletonHolder{
        private static final Singleton5 instance = new Singleton5();
    }
    private Singleton5(){}
    public static Singleton5 getInstance(){
        return  SingletonHolder.instance;
    }
    public void showMessage(){
        System.out.println("hello singleton5");
    }
}
