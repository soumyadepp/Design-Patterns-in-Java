/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondesignpattern;

/**
 *
 * @author ghosh
 */
import portal.Portal;
public class SingletonDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Portal portal = Portal.getInstance();
        System.out.println(portal);
        Portal portalAgain = Portal.getInstance();
        System.out.println(portalAgain);
        Portal portalYetAgain = Portal.getInstance();
        System.out.println(portalYetAgain);
    }
    
}
