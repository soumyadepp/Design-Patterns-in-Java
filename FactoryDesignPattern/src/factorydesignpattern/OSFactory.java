/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;
import OsModule.*;
import DeviceModule.*;
/**
 *
 * @author ghosh
 */
public class OSFactory {
    Device d;
    OperatingSystem os;
    public OSFactory(Device d){
        switch (d.getClass().getName()) {
            case "DeviceModule.Phone":
                this.os = new Android("One Plus","Java","1.0.0.1");
                this.d = d;
                break;
            case "DeviceModule.Laptop":
                this.os = new Windows("Java","Microsoft");
                this.d = d;
                break;
            default:
                this.os = new Ios("3.0.0.2");
                this.d = d;
                break;
        }
    }
    public OperatingSystem getOs(){
        this.os.run();
        return this.os;
    }
}
