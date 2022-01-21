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
public class DisplayFriendlyRectangle implements DisplayFriendlyShape{
    private int length,breadth;

    public DisplayFriendlyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Display Friendly Rectangle created");
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing display friendly rectangle");
    }

    @Override
    public String toString() {
        return "DisplayFriendlyRectangle{" + "length=" + length + ", breadth=" + breadth + '}';
    }
    
}
