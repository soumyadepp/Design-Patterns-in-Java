/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;

/**
 *
 * @author ghosh
 */
public class Portal {
    private static int countRevokes;
    private Portal(){
        countRevokes = 1;
    }
    public static Portal myInstance;
    public int getRevokes(){
        return countRevokes;
    }
    public static Portal getInstance(){
        if(myInstance == null){
            myInstance = new Portal();
            return myInstance;
        }
        countRevokes++;
        return myInstance;
    }

    @Override
    public String toString() {
        int cnt = this.getRevokes();
        if(cnt > 1)
        return "Portal was used " + this.getRevokes() + " times";
        
        return "Portal successfully initiated";
    }
    
}
