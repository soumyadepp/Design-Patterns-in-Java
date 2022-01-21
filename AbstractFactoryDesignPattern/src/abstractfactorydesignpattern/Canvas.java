/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydesignpattern;
import java.util.ArrayList;
import Shape.*;
import ShapeFactory.*;
import java.util.Iterator;
/**
 *
 * @author ghosh
 */
public class Canvas {
    private ArrayList<Shape>shapeList = new ArrayList<Shape>();
    public void addNewShape(String shapeType,String objectType){
        Shape shape = null;
        switch(objectType){
            case "DisplayFriendly":
                shape = new DisplayFriendlyFactory().getShape(shapeType);
                break;
            case "PrinterFriendly":
                shape = new PrinterFriendlyShapeFactory().getShape(shapeType);
                break;
            default:
                shape = new PrinterFriendlyShapeFactory().getShape("null");
        }
        shapeList.add(shape);
    }
    public void redraw(){
        Iterator<Shape> itr = shapeList.iterator();
        while(itr.hasNext()){
            Shape shape = itr.next();
            shape.draw();
        }
    }
}
