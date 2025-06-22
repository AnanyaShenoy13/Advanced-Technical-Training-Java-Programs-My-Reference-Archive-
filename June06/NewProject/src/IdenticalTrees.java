class INode{
    int data;
    INode left;
    INode right;
    INode(int data){
        this.data = data;
        left=right=null;
    }
}
public class IdenticalTrees {
    static boolean isIdentical(INode t1, INode t2){
        //If both are empty return null, they are identical
        if(t1==null && t2==null){
            return true;
        }
        //One of them is empty->not identical
        if(t1==null || t2==null){
            return false;
        }
        //Compare the root data of both nodes
        if(t1.data!=t2.data){
            return false;
        }
        //Use recursion to check the left and right subtrees of both the tress
        return (isIdentical(t1.left,t2.left)  && isIdentical(t1.right,t2.right));
    }

    public static void main(String[] args) {
        INode t1 = new INode(1);
        t1.left= new INode(3);
        t1.right= new INode(4);
        INode t2 = new INode(2);
        t2.left= new INode(5);
        t2.right= new INode(6);
        if(isIdentical(t1,t2)){
            System.out.println("identical");
        }
        else{
            System.out.println("not identical");
        }

    }
}
