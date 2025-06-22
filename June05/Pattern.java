public class Pattern {
    public static void main(String[] args) {
        for(int row=0;row<6;row++){
            for(int col=0;col<7;col++){
                if(row==0 && col%3!=0 || row==1 && col%3==0 || row-col==2 || row+col==8){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //System.out.println();
        //Reverse Order
        for(int row=0;row<6;row++){
            for(int col=0;col<7;col++){
                if(row==5 && col%3!=0 || row==4 && col%3==0 || row+col==3 || row-col==-3){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
