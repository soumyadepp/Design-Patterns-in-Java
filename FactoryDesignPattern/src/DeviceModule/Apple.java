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
public class Apple extends Device{
    String type;
    public void start(){
        System.out.println("Apple device started");
    }
    public Apple(){
        this.type = "Apple";
    }
    public String getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "Apple{" + "type=" + type + '}';
    }
    
}
