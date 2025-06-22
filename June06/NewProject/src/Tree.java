public class Tree {
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public static void inorder(Tree root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data +" ");
            inorder(root.right);
        }
    }
    private static Tree mirrortree(Tree root){
        if(root==null){
            return root;
        }
        //Swap the left and right subtree
        Tree temp=root.left;
        root.left=root.right;
        root.right=temp;
        //Recursively swap left and right subtree
        if(root.left!=null){
            mirrortree(root.left);
        }
        if(root.right!=null){
            mirrortree(root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        Tree root=new Tree(1);
        root.left=new Tree(2);
        root.right=new Tree(3);
        root.left.left=new Tree(4);
        root.left.right=new Tree(5);
        root.right.left=new Tree(6);
        root.right.right=new Tree(7);
        System.out.println("Inorder of original tree: ");
        inorder(root);
        System.out.println();
        System.out.println("Inorder of mirror tree: ");
        inorder(root);
        System.out.println();


    }
}
