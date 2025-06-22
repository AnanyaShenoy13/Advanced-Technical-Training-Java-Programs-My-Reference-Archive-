import java.io.*;
import java.util.Arrays;

public class RadixSort {
    public static void radixsort(int[] arr){
        //Find max
        int max=arr[0];
        for(int num:arr){
            max=Math.max(max,num);
        }

        //Call the count sort method to sort the array
        for(int exp=1;max/exp>0;exp*=10){
            countsort(arr,exp);
        }

    }
    public static void countsort(int arr[], int exp){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10]; //0-9 ten elements

        //Count the occurrences
        for(int i=0;i<n;i++){
            int digit=(arr[i]/exp)%10; // 325/1=325%10=5
            count[digit]++;
        }

        //Cumulative count
        //Skip index 0
        for(int i=1;i<10;i++){
            //curr=curr+prev
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int digit=(arr[i]/exp)%10;
            output[count[digit]-1]=arr[i];
            count[digit]--;
        }

        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }

    public static void main(String[] args) {
        int arr[]={325,3,246,192,5};
        radixsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
