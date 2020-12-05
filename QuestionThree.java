public class QuestionThree {
    public static void main(String[] args){
        Tree tree1 = new Tree();
        tree1.root = new TreeNode(26);
        tree1.root.right = new TreeNode(3);
        tree1.root.left = new TreeNode(10);
        tree1.root.left.left = new TreeNode(4);

        Tree tree2 = new Tree();
        tree2.root = new TreeNode(3);
        tree2.root.right = new TreeNode(3);

        if (tree1.isSubtree(tree1.root, tree2.root))
            System.out.println("Tree 2 is a subtree inside Tree 1.");
        else
            System.out.println("Tree 2 isn't a subtree inside Tree 1.");
    }
}
