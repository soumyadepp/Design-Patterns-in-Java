/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author ghosh
 */
import java.util.ArrayList;

public class BubbleSort extends SortController{
    private ArrayList<Integer>arrayToBeSorted;
    public BubbleSort(ArrayList<Integer>arr){
        this.arrayToBeSorted = arr;
    }
    private void BubbleSortRender(ArrayList<Integer>arr){
        for(int i = 0 ; i < arr.size() - 1; i++){
            for(int j = i + 1 ; j < arr.size(); j++){
                if(arr.get(i) > arr.get(j)){
                    Integer temp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
    }
    @Override 
    public void sort(){
        System.out.println("Performing Bubble Sort");
        BubbleSortRender(arrayToBeSorted);
    }
}
