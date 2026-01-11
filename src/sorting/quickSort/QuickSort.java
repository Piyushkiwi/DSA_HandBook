package sorting.quickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,-1,8,4,23,7,1,0,-56};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //helper function for sorting
    public static void sort(int[] arr,int si,int ei){
        if(si<ei){
            int ind=partition(arr,si,ei);
            sort(arr,si,ind);
            sort(arr,ind+1,ei);
        }
    }
    //partition function
    //helper function to partition the array
    public static int partition(int[] arr,int si,int ei){
        int n=arr.length;
        int i=si;
        int pivot=arr[si];
        for(int j=si+1;j<=ei;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        arr[si]=arr[i];
        arr[i]=pivot;
        return i;
    }
    //swap function
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
