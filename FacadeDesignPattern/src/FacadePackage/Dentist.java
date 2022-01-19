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
public class Dentist implements Doctor{
    private String name;
    private int fees;
    public Dentist(String s,int f){
        this.name = s;
        this.fees = f;
    }
    @Override
    public void treat(Disease disease){
        ToothAche ta = (ToothAche)disease;
        System.out.println("Dentist is treating " + ta.getClass().getName());
    }
    public String toString(){
        return "Name : " + this.name + "\n Fees :" + this.fees + "\n";
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
