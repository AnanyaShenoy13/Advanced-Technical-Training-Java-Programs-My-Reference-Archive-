public class SquareRoot {
    static int sqrt(int n){
        int s=0;
        int e=n;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            int square=mid*mid;
            if(square==n){
                return mid;
            }
            else if(square<n){
                //Store the answer and move right.
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(sqrt(64));
    }
}
