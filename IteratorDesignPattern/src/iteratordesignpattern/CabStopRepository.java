/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratordesignpattern;
import java.util.List;
import java.util.ArrayList;
import interfaces.Container;
import interfaces.Iterator;
/**
 *
 * @author ghosh
 */
public class CabStopRepository implements Container{
    String[] stops;
    public CabStopRepository(String[] stops){
        this.stops = stops;
    }
    @Override
    public Iterator getIterator(){
        return new StopIterator();
    }
    private class StopIterator implements Iterator{
        int idx;
        public StopIterator(){
            idx = 0;
        }
        @Override
        public boolean hasNext(){
            if(idx < stops.length){
                return true;
            }
            return false;
        }
        @Override 
        public Object next(){
            if(this.hasNext()){
                return stops[idx++];
            }
            return null;
        }
    }
}
