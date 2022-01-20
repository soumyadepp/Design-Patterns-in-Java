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
public class Ios implements OperatingSystem{
    String version;
    final String company = "Apple";
    @Override
    public void run(){
        System.out.println("Ios version " + this.version + " has been installed");
    }
    public Ios(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Ios{" + "version=" + version + ", company=" + company + '}';
    }
}
