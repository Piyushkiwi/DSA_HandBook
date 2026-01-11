package sorting.quickSort;

import java.util.Arrays;

/*In Lomuto Partition we partition the array by taking the last element
as pivot.
After doing the Lomuto partition all the element grater than the pivot i.e
the last element will be on right side of pivot and rest all will be on the left of
the pivot.And finally the last element or the pivot will be at it's correct position.

e.g [10,80,30,90,40,50,70]
After lomuto partition result will be [10,30,40,50,70,90,80]
* */
public class LomutoPartition {
    public static void main(String[] args) {
        int[] arr={10,80,30,90,40,50,70};
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Helper function to partition the array.
    public static void partition(int[] arr){
        int n=arr.length;
        int i=-1;
        int pivot=arr[n-1];
        for(int j=0;j<n;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        //finally place the pivot at its correct position.
        arr[n-1]=arr[i+1];
        arr[i+1]=pivot;
    }
    //swap function
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
