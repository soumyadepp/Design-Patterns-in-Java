/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;
import java.util.ArrayList;
/**
 *
 * @author ghosh
 */
public class QuickSort extends SortController{
    private ArrayList<Integer>arrayToBeSorted;
    public QuickSort(ArrayList<Integer>arr){
        this.arrayToBeSorted = arr;
    }
    private int partition(ArrayList<Integer> arr,int low,int high){
        Integer pivotElement = arr.get(high);
        int i = low - 1;
        for(int j = low ; j <= high - 1 ; j++){
            if(arr.get(j) < pivotElement){
                i++;
                Integer temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j,temp);
            }
        }
        Integer temp = arr.get(high);
        arr.set(high,arr.get(i + 1));
        arr.set(i + 1,temp);
        return i + 1;
    }
    private void QuickSortRender(ArrayList<Integer>arr,int low,int high){
        if(low < high){
            int p = partition(arr,low,high);
            QuickSortRender(arr,low,p - 1);
            QuickSortRender(arr,p + 1,high);
        }
    }
    @Override
    public void sort(){
        System.out.println("Performing QuickSort");
        QuickSortRender(arrayToBeSorted,0,arrayToBeSorted.size() - 1);
    }
}
