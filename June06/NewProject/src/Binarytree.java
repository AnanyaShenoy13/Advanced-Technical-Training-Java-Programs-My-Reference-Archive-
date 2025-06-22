import java.util.LinkedList;
import java.util.Queue;

class TNode {
    int data;
    TNode left;
    TNode right;

    TNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
 public class Binarytree {
    public static void levelorder(TNode root) {
        //Base Case
        //If the tree is empty, don't traverse
        if(root==null){
            return;
        }
        Queue<TNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TNode temp=queue.poll(); //Removes and stores the front element
            System.out.print(temp.data+ " ");
            //LEft sub-tree
            if(temp.left!=null){
                queue.add(temp.left);
            }
            //Right sub-tree
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        System.out.println();
    }
     public static void main(String[] args) {
         TNode root=new TNode(1);
         root.left=new TNode(2);
         root.right=new TNode(3);
         root.left.right=new TNode(4);
         root.right.right=new TNode(5);
         System.out.println("Traversal of Binary Tree: ");
         levelorder(root);
     }
}
