package datstruc;

public class App {
    public static void main(String[] args) {
        // Membuat struktur pohon manual
        // Level 0
        TreeNode<String> rootNode = new TreeNode<>("A (Root)");
        Tree<String> myTree = new Tree<>(rootNode);

        // Level 1
        TreeNode<String> b = new TreeNode<>("B");
        TreeNode<String> c = new TreeNode<>("C");
        rootNode.children.add(b);
        rootNode.children.add(c);

        // Level 2
        b.children.add(new TreeNode<>("D (Leaf)"));
        b.children.add(new TreeNode<>("E (Leaf)"));
        c.children.add(new TreeNode<>("F (Leaf)"));

        // Menjalankan Tugas 4.3e
        System.out.print("Output 4.3e (Leaves): ");
        myTree.printLeaves();

        // Menjalankan Tugas 4.3f
        System.out.print("Output 4.3f (Depth 2): ");
        myTree.printAtDepth(2);
    }
}