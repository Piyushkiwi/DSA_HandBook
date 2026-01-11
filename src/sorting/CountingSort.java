package sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] input={2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(input));
        countSort(input);
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(input));
    }
    //function to sort the array
    static void countSort(int[] input){
        int max=input[0];
        //find the Range
        for(int i=0;i<input.length;i++){
            if(input[i]>max){
                max=input[i];
            }
        }
        //create the count array
        int[] count=new int[max+1];
        //fill the count array with the frequency of distinct element
        for(int i=0;i<input.length;i++){
            count[input[i]]++;
        }

        //update the count array  with the prefix sum
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        //create the output array
        int[] output=new int[input.length];

        //fill the output array
        for(int i=input.length-1;i>=0;i--){
            count[input[i]]--;//reduce the value to get the correct index in the output array
            output[count[input[i]]]=input[i];//fill the element from the input array at the correct index in output array
        }

        //copy the output back to the original array
        for(int i=0;i<output.length;i++) {
            input[i] = output[i];
        }
        //copy the element back to the ultimate version of the smalllest and the fixed into the
    }
}
