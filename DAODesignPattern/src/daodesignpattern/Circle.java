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
public class Circle {
    private int xPos,yPos;
    private int radius;

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }
    public String toString(){
        return "Center = " + xPos + "," + yPos + " and radius = " + radius + "\n";
    }
    public CircleTransfer getCircleTransferObject(){
        CircleTransfer circleTransfer = new CircleTransfer();
        circleTransfer.setRadius(radius);
        circleTransfer.setxPos(xPos);
        circleTransfer.setyPos(yPos);
        return circleTransfer;
    }
}
