public class Tree {
    public TreeNode root;
    public Tree(){
        root = null;
    }

    public Tree(TreeNode t){
        root = t;
    }

    public boolean isEqualTreeNode(TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null)
            return true;

        if (node1 == null || node2 == null)
            return false; 

        return (node1.data == node2.data && isEqualTreeNode(node1.left, node2.left) && isEqualTreeNode(node1.right, node2.right));
    }

    boolean isSubtree(TreeNode node1, TreeNode node2) {
        if (node2 == null)
            return true;

        if (node1 == null)
            return false;

        if (isEqualTreeNode(node1, node2))
            return true; 

        return (isSubtree(node1.left, node2) || isSubtree(node1.right, node2));
    }
}
