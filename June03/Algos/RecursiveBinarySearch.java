public class RecursiveBinarySearch {
    public static int binarysearch(int[] arr,int key,int s, int e){
        if(s>e) return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==key) return mid;
        else if(arr[mid]>key) return binarysearch(arr,key,s,mid-1);
        else return binarysearch(arr,key,mid+1,e);
    }

    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,7,8,9,45};
        int pos=binarysearch(arr,45,0,arr.length-1);
        System.out.println("Position: "+pos);
    }
}
