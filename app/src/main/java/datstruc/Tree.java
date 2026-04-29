package datstruc;

import java.util.ArrayList;
import java.util.List;

// 1. Definisi Node (Tanpa public agar bisa satu file dengan Tree)
class TreeNode<T> {
    T data;
    List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }
}

// 2. Definisi Tree (Ini yang public)
public class Tree<T> {
    private TreeNode<T> root;

    public Tree(TreeNode<T> root) {
        this.root = root;
    }

    // Tugas 4.3e: Cetak Daun dari Kiri ke Kanan
    public void printLeaves() {
        if (root == null) return;
        printLeavesRecursive(root);
        System.out.println();
    }

    private void printLeavesRecursive(TreeNode<T> current) {
        if (current.isLeaf()) {
            System.out.print(current.data + " ");
        } else {
            for (TreeNode<T> child : current.children) {
                printLeavesRecursive(child);
            }
        }
    }

    // Tugas 4.3f: Cetak di Kedalaman n
    public void printAtDepth(int targetDepth) {
        if (root == null || targetDepth < 0) return;
        printAtDepthRecursive(root, 0, targetDepth);
        System.out.println();
    }

    private void printAtDepthRecursive(TreeNode<T> current, int currentDepth, int targetDepth) {
        if (currentDepth == targetDepth) {
            System.out.print(current.data + " ");
            return; 
        }
        for (TreeNode<T> child : current.children) {
            printAtDepthRecursive(child, currentDepth + 1, targetDepth);
        }
    }
}