/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydesignpattern;

/**
 *
 * @author ghosh
 */
public class AbstractFactoryDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.addNewShape("Circle","DisplayFriendly");
        canvas.addNewShape("Rectangle","PrinterFriendly");
        canvas.addNewShape("Rectangle","DisplayFriendly");
        canvas.addNewShape("Circle","PrinterFriendly");
        canvas.redraw();
    }
    
}
