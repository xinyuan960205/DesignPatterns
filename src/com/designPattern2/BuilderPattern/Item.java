package com.designPattern2.BuilderPattern;

/**
 * @ClassName: Item
 * @Description: 食物条目接口
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 12:29
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
