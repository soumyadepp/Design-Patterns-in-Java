/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeviceModule;

/**
 *
 * @author ghosh
 */
public class Phone extends Device{
    String type;
    public void start(){
        System.out.println("Phone started");
    }
    public Phone(){
        this.type = "Phone";
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Phone{" + "type=" + type + '}';
    }
    
}
