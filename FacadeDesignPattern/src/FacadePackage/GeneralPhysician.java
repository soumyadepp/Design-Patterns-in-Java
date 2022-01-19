package FacadePackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ghosh
 */
public class GeneralPhysician implements Doctor{
    private String name;
    private int fees;
    public GeneralPhysician(String n,int f){
        this.name = n;
        this.fees = f;
    }
    public void treat(Disease disease){
        BodyAche ba = (BodyAche)disease;
        System.out.println("General Physician is treating " + ba.getClass().getName());
    }
    public String toString(){
        return "Name : " + this.name + "\n Fees : " + this.fees + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
    
}
