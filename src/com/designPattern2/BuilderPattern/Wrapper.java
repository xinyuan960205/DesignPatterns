package com.designPattern2.BuilderPattern;

/**
 * @ClassName: Wrapper
 * @Description: 纸质包装实体类
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 12:31
 */
public class Wrapper implements Packing{
    @Override
    public String pack(){
        return "wrapper";
    }
}
