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
public class Android implements OperatingSystem{
    String company;
    String language;
    String version;
    
    @Override
    public void run(){
        System.out.println("Android " + this.version + "Installed");
    }
    public Android(String company, String language, String version) {
        this.company = company;
        this.language = language;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Android{" + "company=" + company + ", language=" + language + ", version=" + version + '}';
    }
    
}
