package com.designPattern2.BuilderPattern;

/**
 * @ClassName: Bottle
 * @Description: 包装类接口实体类
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 12:32
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "bottle";
    }
}
