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
public class DAOFactory {
    public static CircleDAO getCircleDAO(String sourceType){
        switch(sourceType){
            case "RDBMS":
                return new RDBMSCircleDAO();
        }
        return null;
    }
}
