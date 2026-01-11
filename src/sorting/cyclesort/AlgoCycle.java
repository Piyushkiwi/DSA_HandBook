package sorting.cyclesort;

import java.util.Arrays;

public class AlgoCycle {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2,4};
        System.out.println("Arrays before sorting : ");
        System.out.println(Arrays.toString(arr));
        helperCycle(arr);
        System.out.println("Arrays after sorting : ");
        System.out.println(Arrays.toString(arr));
    }

    //function to sort the array
    private static void helperCycle(int[] arr){
       int n=arr.length;
       int index=0;
       while(index<n){
           int element=arr[index];
           int actualPos=element-1;
           //If element is not at it's correct position then swap.
          if(arr[index]<n && arr[index]!=arr[actualPos]){
              swap(arr,index,actualPos);
          }else{
              index++;
          }
       }

    }
    //swap function
    private static void swap(int[] arr,int a,int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
    }
}
