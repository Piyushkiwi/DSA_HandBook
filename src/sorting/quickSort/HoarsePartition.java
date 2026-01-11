package sorting.quickSort;

import java.util.Arrays;

/*In Hoarse Partition we take the first element as the pivot and then try to partition
the array around this element such that all the element less that pivot is to the left
of pivot and the rest greater than pivot is at the right of pivot.
e.g [5,3,8,4,2,7,1,10]
output :[1,3,4,2,5,7,8,10].
* */
public class HoarsePartition {
    public static void main(String[] args) {
        int[] arr={5,3,8,4,2,7,1,10};
        partition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //helper function to partition the array
    public static void partition(int[] arr,int si,int ei){
        int n=arr.length;
        int i=si;
        int pivot=arr[0];
        for(int j=1;j<n;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        arr[si]=arr[i];
        arr[i]=pivot;
    }
    //swap function
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
