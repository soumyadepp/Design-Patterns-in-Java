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
public class BodyAche extends Disease{
    private int duration;
    private int severity;
    private boolean treated;
    public BodyAche(){
        treated = true;
    }
    public void initiate(){
        treated = false;
        System.out.println("BodyAche is occuring");
    }
    public String toString(){
        return "Body ache duration : " + this.duration + "\nSeverity : " + this.severity + "\n";
    }

    public boolean isTreated() {
        return treated;
    }

    public void setTreated(boolean treated) {
        this.treated = treated;
    }

    public int getDuration() {
        return duration;
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
