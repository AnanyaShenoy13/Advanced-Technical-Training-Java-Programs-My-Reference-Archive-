import java.util.Arrays;
import java.util.Scanner;

public class NikunjandDonuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input the number of donuts
        int n=sc.nextInt();
        int[] calories=new int[n];
        //Input the calorie values
        for(int i=0;i<n;i++){
            calories[i]=sc.nextInt();
        }
        //sort the array in ascending order to eat the highest-calories donut first
        Arrays.sort(calories);
        int left=0;
        int right=n-1;
        while(left<right) {
            int temp = calories[left];
            calories[left] = calories[right];
            calories[right] = temp;
            left++;
            right--;
        }
        long totalMiles=0;
        for(int i=0;i<n;i++){
            totalMiles+=Math.pow(2,i)*calories[i];
        }
        //same can be written as
//        for(int i=0;i<n;i++){
//            totalMiles+=(1L << i)* calories[i];
//        }
        System.out.println(totalMiles);
    }
}
