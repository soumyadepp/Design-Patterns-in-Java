/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignpattern;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author ghosh
 */
public class Module {
    int id;
    String name;
    List<Module>dependencies;
    public Module(int id,String name){
        this.id = id;
        this.name = name;
        dependencies = new ArrayList<Module>();
    }
    void install(Module m){
        dependencies.add(m);
    }
    void uninstall(Module m){
        if(dependencies.contains(m))
        dependencies.remove(m);
        else{
            System.out.println("The requested module");
        }
    }

    @Override
    public String toString() {
        return "Module{" + "id=" + id + ", name=" + name + ", dependencies=" + dependencies + '}';
    }
}
