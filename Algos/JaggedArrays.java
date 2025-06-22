//Each row in a jagged array can have a different number of elements, unlike a traditional 2D array.
//It looks uneven, like stairs, because the rows don't have equal lengths.
//Jagged arrays help save memory when storing irregular data structures.


public class JaggedArrays {
    public static void main(String[] args) {
        int[][] jagged= {{10,20},{34,67,98},{23},{2,3,4,5,6,7,6}};
        for(int[] arr:jagged){
            for(int x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        char[][] lang={{'J','a','v','a'},{'C','+','+'},{'P','y','t','h','o','n'}};
        for(char[] ch:lang){
            for(char x:ch){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
