/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignpattern;

/**
 *
 * @author ghosh
 */
public class CompositeDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Module indexPage = new Module(1,"Home");
        Module expressJs = new Module(2,"Express");
        Module cors = new Module(3,"cors");
        Module bodyParser = new Module(4,"Body-Parser");
        Module moduleEncoder = new Module(5,"Module-encoder");
        indexPage.install(expressJs);
        indexPage.install(cors);
        indexPage.install(bodyParser);
        bodyParser.install(moduleEncoder);
        System.out.println("Home page" + indexPage);
        System.out.println("Body parser : " + bodyParser);
    }
    
}
