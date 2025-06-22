class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class HeightOfBinaryTree {
    static int findHeight(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=findHeight(root.left);
        int rightheight=findHeight(root.right);
        return Math.max(leftheight,rightheight)+1;
        //We are adding 1 for the root node
}
public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left =new Node(4);
        System.out.println("Height of Tree: "+findHeight(root));

    }
}
