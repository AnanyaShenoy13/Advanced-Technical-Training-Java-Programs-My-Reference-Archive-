//Maximum Subarray Sum
public class KadaneAlgorithm {
    public static int kadanealgo(int[] arr){
        int cmax=arr[0];
        int gmax=arr[0];
        for(int i=1;i<arr.length;i++){
            cmax=Math.max(arr[i],cmax+arr[i]);
            gmax=Math.max(cmax,gmax);
        }
        return gmax;
    }

    public static void main(String[] args) {
        int[] arr={5,-8,1,2,-1,4};
        int max=kadanealgo(arr);
        System.out.println("Maximum: "+max);
    }
}

//For minimum subarray sum Math.min can be used instead of Math.max


