package sorting;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] input={15,1,321,10,802,2,125,90,109,11};
        System.out.println("Arrays before sorting:");
        System.out.println(Arrays.toString(input));
        radixSort(input);
        System.out.println("Arrays after sorting");
        System.out.println(Arrays.toString(input));
    }
    //radix sort function
    static void radixSort(int[] input){
        int max=getmax(input);
        for(int pos=1;max/pos>0;pos=pos*10){
            countSort(input,input.length,pos);
        }
    }

    // get max function
    static int getmax(int[] input){
        int max=input[0];
        for(int i=0;i<input.length;i++){
            if(input[i]>max){
                max=input[i];
            }
        }
        return max;
    }

    //countSort function
    static void countSort(int[] input,int n,int pos){
        int[] count=new int[10];
        //fill the count array
        for(int i=0;i<count.length;i++){
            count[(input[i]/pos)%10]++;
        }

        //update the count array with presum
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        //output array
        int[] output=new int[n];
        //fill the output array
        for(int i=n-1;i>=0;i--){
            count[(input[i]/pos)%10]--;
            output[count[(input[i]/pos)%10]]=input[i];
        }

        //copy the result back to original array
        for(int i=0;i<output.length;i++){
            input[i]=output[i];
        }
    }
}
