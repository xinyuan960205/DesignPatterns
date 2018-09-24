package com.designPattern2.PrototypePattern;

import java.util.Hashtable;

/**
 * @ClassName: ShapeCache
 * @Description: 创建一个类，从数据库获取实体类，并把它们存储在一个 Hashtable 中。
 * @Author: xinyuan
 * @CreateDate: 2018/9/24 14:55
 */
public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }

    public static void loadCache(){
        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
