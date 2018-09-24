package com.designPattern2.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Meal
 * @Description: 创建一个 Meal 类，带有上面定义的 Item 对象
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 13:21
 */
public class Meal {
    public List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items){
            System.out.println("Item:"+item.name());
            System.out.println("Packing:"+item.packing().pack());
            System.out.println("price:"+item.price());
        }
    }
}
