package sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={7,3,4,5,1};
        insertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSorting(int[] arr){
        //Pick the element one by one and go the left and place it at it's correct position.
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int indx=i;
            while(indx>0 && arr[indx-1]>key){
                arr[indx]=arr[indx-1];
                indx--;
            }
            arr[indx]=key;
        }
    }

}
