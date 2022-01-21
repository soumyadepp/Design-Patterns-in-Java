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
public class DisplayFriendlyCircle implements DisplayFriendlyShape{
    private int xPos,yPos;
    private int radius;

    public DisplayFriendlyCircle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        System.out.println("Object of DisplayFriendlyCircle created");
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing a display friendly circle");
    }

    @Override
    public String toString() {
        return "DisplayFriendlyCircle{" + "xPos=" + xPos + ", yPos=" + yPos + ", radius=" + radius + '}';
    }
    
}
