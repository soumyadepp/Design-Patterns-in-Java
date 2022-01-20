/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OsModule;

/**
 *
 * @author ghosh
 */
public class Windows implements OperatingSystem{
    String language;
    String company;

    public Windows(String language, String company) {
        this.language = language;
        this.company = company;
    }
    
    @Override
    public void run(){
        System.out.println("Windows is installed");
    }
}
