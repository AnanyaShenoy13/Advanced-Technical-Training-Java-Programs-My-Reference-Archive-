class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
    }
}
public class BinarySearchTree {
    // L<N<R for each node.
    // TC = (logN)
    // Disadvantage -> the height is not balanced -1962
    // To solve this problem, we use AVL Trees or Red Black trees height(0, + or -1)
    // For ascending or descending order data, it becomes a Linked List with TC+O(N)
    static void InOrder(Tree root){
        if(root!=null){
            InOrder(root.left);
            System.out.print(root.data+" ");
            InOrder(root.right);
        }
    }
    static Tree insert(Tree root, int key){
        if(root==null){
            return new Tree(key);
        }
        if(key<root.data){
            root.left=insert(root.left,key);
        }
        else if(key>root.data){
            root.right=insert(root.right,key);
        }
        return  root;
    }
    static Tree search(Tree root, int key){
        // if root is empty or what if the data is at the root only
        if(root==null || root.data==key){
            return root;
        }
        if(root.data<key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
    static Tree findMin(Tree root) {
        Tree curr = root;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
    static Tree delete(Tree root, int key){
        if (root == null) {
            return null;
        }
        if(key<root.data){
            root.left=delete(root.left,key);
        }
        else if(key>root.data){
            root.right=delete(root.right,key);
        }
        else{
            //Only one child
            if (root.left == null) { //Left child does not exist
                Tree temp=root.right;
                root=null;
                return temp;
            }
            else if(root.right==null){
                Tree temp=root.left;
                root=null;
                return temp;
            }
            //Node with more than 2 children
            //Find the in-order successor and replace the root node with that value
            Tree temp = findMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }
    public static void main(String[] args) {
        Tree root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 70);
        insert(root, 80);

        System.out.println("Inorder traversal is: ");
        InOrder(root);

        System.out.println("\nDeleted\n");
        root = delete(root, 50);
        InOrder(root);

        System.out.println("\nDeleted\n");
        root = delete(root, 90);  // Doesn't exist
        InOrder(root);

        System.out.println();
        Tree result = search(root, 40);
        if (result == null) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found: " + result.data);
        }
    }
}
