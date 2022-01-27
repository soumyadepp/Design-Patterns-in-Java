/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import youtube.*;

/**
 *
 * @author ghosh
 */
public class ObserverDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Channel channel = new Channel("SoumyadeppCodes");
        Subscriber s1 = new Subscriber("Rahul Patel");
        Subscriber s2 = new Subscriber("Ramesh Shah");
        Subscriber s3 = new Subscriber("Helloworld");

        channel.subscribe(s3);
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.upload("How to Code");
        System.out.println("Uploaded successfully");
        
        //when user opens the notifications mark as seen
        s1.markAsSeen();
        s2.markAsSeen();
        s3.markAsSeen();
        
        //replica of all notifications
        System.out.println("All old notifications");
        s1.showNotifs();
        s2.showNotifs();
        s3.showNotifs();
        
      
    }

}
