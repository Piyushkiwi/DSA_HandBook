package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={7,3,4,5,1};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//for every element 'i' go and search
            int ind=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[ind]){
                    ind=j;
                }
            }
            int temp=arr[ind];
            arr[ind]=arr[i];
            arr[i]=temp;
        }
    }
}
