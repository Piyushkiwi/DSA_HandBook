package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array element");
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));
         int[] count=new int[1];
        mergeSort(arr,0,4,count);
        System.out.println("Array after sorting : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("No. of conversions is : "+Arrays.toString(count));

    }
    //merge sort function
    public static void mergeSort(int[] arr,int si,int ei,int[] count){
       if(si>=ei){
           return ;
       }
       int mid=si+(ei-si)/2;
       mergeSort(arr,si,mid,count);
       mergeSort(arr,mid+1,ei,count);
       merge(arr,si,mid,ei,count);
    }
    //merge function
    public static void merge(int[] arr,int si,int mid,int ei,int[] count){
        int[] temp=new int[ei-si+1];
        int ind1=si,ind2=mid+1;
        int x=0;
        while(ind1<=mid && ind2<=ei){
            if(arr[ind1]>arr[ind2]){
                temp[x++]=arr[ind2++];
//                count[0]+=(mid-ind1+1); this is for counting inversions.
            }else{
                temp[x++]=arr[ind1++];
            }
        }
        //populate the left over
        while(ind1<=mid){
            temp[x++]=arr[ind1++];
        }
        while(ind2<=ei){
            temp[x++]=arr[ind2++];
        }
        //replace the original array with temp
        for(int i=0,j=si;i<temp.length;i++,j++){
            arr[j]=temp[i];
        }
    }
}
