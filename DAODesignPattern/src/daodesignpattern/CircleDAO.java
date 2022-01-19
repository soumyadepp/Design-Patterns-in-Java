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
public interface CircleDAO {
    public void insertCircle(CircleTransfer circle);
    public CircleTransfer findCircle(int id);
    public void deleteCircle(int id);
}
