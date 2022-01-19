/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daodesignpattern;

/**
 *
 * @author ghosh
 */
public class DAODesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle(10,10,20);
        System.out.println(circle);
        CircleTransfer circleTransfer = circle.getCircleTransferObject();
        CircleDAO circleDAO = DAOFactory.getCircleDAO("RDBMS");
        circleDAO.insertCircle(circleTransfer);
    }

}
