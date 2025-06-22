import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinimumCoins {
    static void findMinimumcoins(List<Integer> coins, int v){
        List<Integer> result=new ArrayList<>();
        // If the array or List is not sorted, sort it first
        // traverse the sorted array from the end to the beginning
        for(int i=coins.size()-1;i>=0;i--){
            while(v>=coins.get(i)){
                v-=coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.print("Coins selected: ");
        for(int coin:result){
            System.out.print(coin+" ");
        }
        System.out.println();
        System.out.println("Minimum number of coins selected: "+result.size());
    }

    public static void main(String[] args) {
        int v=91;
        List<Integer> coins= Arrays.asList(1,2,5,10,20,50,100,200,500,1000);
        findMinimumcoins(coins,v);
    }
}
