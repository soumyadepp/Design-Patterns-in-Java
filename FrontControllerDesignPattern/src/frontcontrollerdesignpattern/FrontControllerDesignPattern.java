/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontcontrollerdesignpattern;
import sort.*;
import java.util.ArrayList;
/**
 *
 * @author ghosh
 */
public class FrontControllerDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer>arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(5);
        arr.add(2);
        arr.add(1);
        arr.add(-2);
        arr.add(8);
        ArrayList<Integer>arr2 = new ArrayList<Integer>();
        arr2.add(3);
        arr2.add(6);
        arr2.add(8);
        arr2.add(1);
        arr2.add(-4);
        QuickSort sq = new QuickSort(arr);
        BubbleSort sb = new BubbleSort(arr2); 
        sq.sort();
        for(int i = 0 ; i < arr.size(); i++){
            System.out.println("Element at " + i +"th index = " + arr.get(i));
        }
        sb.sort();
        for(int i = 0 ; i < arr2.size(); i++){
            System.out.println("Element at " + i +"th index = " + arr2.get(i));
        }
    }
    
}
