/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeFactory;
import Shape.*;
/**
 *
 * @author ghosh
 */
public class DisplayFriendlyFactory implements ShapeFactory{
    @Override
    public Shape getShape(String sourceType){
        switch(sourceType){
            case "Circle":
                return new DisplayFriendlyCircle(3,3,3);
            case "Rectangle":
                return new DisplayFriendlyRectangle(4,5);
            default:
                return new DisplayFriendlyCircle(0,0,0);
        }
    }
}
