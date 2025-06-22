class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SerializeHelper {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    // Helper method for serialization
    private void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null,");
            return;
        }
        sb.append(node.val).append(",");
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    // Deserialize the string back into a tree
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        int[] index = {0};  // pass index by reference
        return deserializeHelper(values, index);
    }

    // Helper method for deserialization
    private TreeNode deserializeHelper(String[] values, int[] index) {
        if (index[0] >= values.length || values[index[0]].equals("null")) {
            index[0]++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(values[index[0]]));
        index[0]++;
        node.left = deserializeHelper(values, index);
        node.right = deserializeHelper(values, index);
        return node;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        SerializeHelper sh = new SerializeHelper();

        String serialized = sh.serialize(root);
        System.out.println("Serialized Tree: " + serialized);

        TreeNode deserializedRoot = sh.deserialize(serialized);
        System.out.println("Tree deserialized successfully.");
    }
}
