import java.util.Scanner;

public class RatInMaze {
    static boolean isSafe(int[][] arr,int x, int y, int n){
        return (x<n && y<n && arr[x][y]==1);
    }
    static boolean ratInMaze(int[][]arr, int x, int y, int n,int[][] resultantarray){
        //Base Case
        //f the rat has already rwached the destination[n-1][n-1]
        if(x==n-1 && y==n-1){
            resultantarray[x][y]=1;
            return true;
        }
        //Check if the rat can stand at the current position/cell(x,y)
        if(isSafe(arr,x,y,n)){
            resultantarray[x][y]=1;
            //Move forward to find a path
            if(ratInMaze(arr,x+1,y,n, resultantarray)){
                return true;
            }
            //Move downward to find a path
            if(ratInMaze(arr,x,y+1,n,resultantarray)){
                return true;
            }
            //We couldn't find a path, so we backtrack
            resultantarray[x][y]=0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        //Input array(maze) nxn
        int[][] arr=new int[n][n];
        System.out.println("Enter the maze array values(0 & 1): ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //Take the resultant values (nxn) initialised with 0s
        int[][] resultantarray=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                resultantarray[i][j]=0;
            }
        }
        if(ratInMaze(arr,0,0,n,resultantarray)){
            //A path exists if it is in the resultant array
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(resultantarray[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("No path found");
        }
    }

}
