/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypedesignpattern;

import java.util.HashMap;
/**
 *
 * @author ghosh
 */
public class ShapeCache {
    public static HashMap<String,Shape>shapeMap = new HashMap<>();
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }
    public static void loadCache(){
        System.out.println("Starting objects creation and caching");
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);
        Rectangle rect = new Rectangle();
        rect.setId("3");
        shapeMap.put(rect.getId(),rect);
        System.out.println("Object creation and caching done");
    }
}
