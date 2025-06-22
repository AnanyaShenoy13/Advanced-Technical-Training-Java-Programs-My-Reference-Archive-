public class FirstAndLast {
    static int firstOccurrence(int[] arr,int key){
        int s=0;
        int e=arr.length;
        int mid=0;
        int ans=-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if(arr[mid]==key){
                // Go to the extreme left to find first occurrence
                //Store the value
                ans=mid;
                e=mid-1;
            }
            else if(arr[mid]<key){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    static int lastOccurrence(int[] arr,int key){
        int s=0;
        int e=arr.length;
        int mid=0;
        int ans=-1; 
        while(s<=e){
            mid=s+(e-s)/2;
            if(arr[mid]==key){
                // Go to the extreme right to find first occurrence
                //Store the value
                ans=mid;
                s=mid+1;
            }
            else if(arr[mid]<key){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    static int totalOccurrence(int[] arr,int key){
            int f=firstOccurrence(arr,key);
            int l=lastOccurrence(arr,key);
            int total=l-f+1;
            return total;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5};
        int f0=firstOccurrence(arr,3);
        int l0=lastOccurrence(arr,3);
        int t=totalOccurrence(arr,3);
        System.out.println(f0);
        System.out.println(l0);
        System.out.println(t);
    }
}
