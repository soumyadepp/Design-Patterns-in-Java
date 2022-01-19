/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypedesignpattern;

/**
 *
 * @author ghosh
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
        System.out.println("Circle object created");
    }
    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method");
    }
}