import java.util.Arrays;

public class CountSortAlgo {
    public static void countsort(int[] arr) {
        //Step 1:Find max
        int k=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>k){
                k=arr[i];
            }
        }

        //Create a count array of 0 to max
        int[] count=new int[k+1];
        //Calculate the frequency of each element in the array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //Calculate the cumulative count
        //c=c+p
        //Skip index 0 and go from 1 till max
        //Because index 0 has no previous index
        for(int i=1;i<=k;i++){
            count[i]+=count[i-1];
        }

        //Create the output array
        int[] output=new int [arr.length];
        //Start from end of array -> R to L
        for (int i=arr.length-1;i>=0;i--){
            output[--count[arr[i]]]=arr[i];
        }

        //Copy output array to input array
       /* for(int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }
        */
        System.arraycopy(output, 0, arr,0,arr.length);


    }

    public static void main(String[] args) {
        int[] arr={6,4,3,1,3,2,3,1};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arr));
        countsort(arr);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));


    }
}
