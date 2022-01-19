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
public class MultiSpecialityHospital {
    private Doctor dentist;
    private Doctor generalPhysician;
    public MultiSpecialityHospital(){
        this.dentist = new Dentist("Ram",1000);
        this.generalPhysician = new GeneralPhysician("Shyam",2000);
    }
    public void consultDentist(Disease toothache){
        dentist.treat(toothache);
    }
    public void consultGP(Disease bodyache){
        generalPhysician.treat(bodyache);
    }
}
