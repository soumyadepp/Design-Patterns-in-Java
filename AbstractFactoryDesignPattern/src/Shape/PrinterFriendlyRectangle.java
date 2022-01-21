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
public class PrinterFriendlyRectangle implements PrinterFriendlyShape{
    private int length,breadth;

    public PrinterFriendlyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Printer friendly rectangle created");
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing printer friendly rectangle");
    }

    @Override
    public String toString() {
        return "PrinterFriendlyRectangle{" + "length=" + length + ", breadth=" + breadth + '}';
    }
}
