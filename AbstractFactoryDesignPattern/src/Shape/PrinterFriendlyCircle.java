/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author ghosh
 */
public class PrinterFriendlyCircle implements PrinterFriendlyShape{
    private int xPos,yPos;
    private int radius;

    public PrinterFriendlyCircle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }
    
    @Override 
    public void draw(){
        System.out.println("Drawing printer friendly circle");
    }

    @Override
    public String toString() {
        return "PrinterFriendlyCircle{" + "xPos=" + xPos + ", yPos=" + yPos + ", radius=" + radius + '}';
    }
    
}
