package sorting.quickSort;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,2,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int n=arr.length;
        int i=-1,j=n;
        int mid=0;
        while(mid<=j){
            if(arr[mid]==0){
                i++;
                swap(arr,mid,i);
            }
            else if(arr[mid]==1){
                mid++;
            }
            else
                j--;
            swap(arr,mid,j);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
