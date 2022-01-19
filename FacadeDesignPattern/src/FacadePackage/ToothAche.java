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
public class ToothAche extends Disease{
    private int duration;
    private int severity;
    boolean treated;
    public ToothAche(){
        treated = true;
    }
    public void initiate(){
        treated = false;
        System.out.println("Toothache begins");
    }
    public String toString(){
        return "Toothache duration : " + this.duration + "\n Toothache severity : " + this.severity + "\n";
    }

    public int getDuration() {
        return duration;
    }

    public boolean isTreated() {
        return treated;
    }

    public void setTreated(boolean treated) {
        this.treated = treated;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
    
}
