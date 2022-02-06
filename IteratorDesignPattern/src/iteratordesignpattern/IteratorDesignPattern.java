/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratordesignpattern;

import interfaces.Iterator;
/**
 *
 * @author ghosh
 */
public class IteratorDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] stops = {"Alkapuri","Akota","Manjalpur","Tarsali"};
        CabStopRepository csr = new CabStopRepository(stops);
        System.out.println("The stops of the cab are at");
        for(Iterator it = csr.getIterator(); it.hasNext();){
            String stop = (String)it.next();
            System.out.println(stop + " ");
        }
    }
    
}
