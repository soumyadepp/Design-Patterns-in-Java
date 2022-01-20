/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;
import DeviceModule.*;
/**
 *
 * @author ghosh
 */
//user class
public class FactoryDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Device d = new Laptop();
        OSFactory os = new OSFactory(d);
        System.out.println("Operating System applied is" + os.getOs());
        
    }
    
}
