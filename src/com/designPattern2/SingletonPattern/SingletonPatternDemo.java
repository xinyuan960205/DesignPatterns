package com.designPattern2.SingletonPattern;

/**
 * @ClassName: SingletonPatternDemo
 * @Description: 测试demo
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 11:19
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
        //方法1：懒汉式，线程不安全
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.showMessage();

        //方法2：懒汉式，线程安全
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.showMessage();

        //方法3：饿汉式
        Singleton3 singleton3 = Singleton3.getInstance();
        singleton3.showMessage();

        //方法4：双检锁/双重校验锁
        Singleton4 singleton4 = Singleton4.getInstance();
        singleton4.showMessage();

        //方法5：登记式/静态内部类
        Singleton5 singleton5 = Singleton5.getInstance();
        singleton5.showMessage();

        //方法6：枚举
        Singleton6 singleton6 = Singleton6.INSTANCE;
        singleton6.showMessage();
    }
}
