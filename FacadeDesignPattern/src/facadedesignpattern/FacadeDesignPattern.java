/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadedesignpattern;

import FacadePackage.*;
/**
 *
 * @author ghosh
 */

public class FacadeDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MultiSpecialityHospital hp = new MultiSpecialityHospital();
         ToothAche t1 = new ToothAche();
         t1.setDuration(5);
         t1.setSeverity(2);
         BodyAche b1 = new BodyAche();
         b1.setDuration(10);
         b1.setSeverity(3);
         System.out.println("Disease Initiated");
         hp.consultDentist(t1);
         hp.consultGP(b1);
         System.out.println("Consultation complete");
    }
}
