import java.util.Scanner;

public class ZigzagPattern {
    static void zigZag(int cols){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 && (i+j)%4==0 || i==2 && (j-i)%2==0 || i==3 && (i+j)%4==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zigZag(21);

    }
}
