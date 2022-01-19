/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypedesignpattern;

/**
 *
 * @author ghosh
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void draw();

    public String getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
   
