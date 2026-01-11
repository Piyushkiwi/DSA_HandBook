package sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={1,-4,3,2,0};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    //bubble sort function
    public static void bubbleSorting(int[] arr){
        for(int i=0;i<arr.length;i++){//this will decide the no. of swaps
            for(int j=0;j<arr.length-1-i;j++){//for repetitive swapping
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
