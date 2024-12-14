// Definition for a binary tree node.
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Solution {
    public TreeNode lca(TreeNode root, int p, int q) {
        // Base case: if the root is null or one of the nodes is found, return the current root
        if (root == null || root.data == p || root.data == q) {
            return root;
        }

        // Recursively find the lowest common ancestor in the left subtree
        TreeNode left = lca(root.left, p, q);
        // Recursively find the lowest common ancestor in the right subtree
        TreeNode right = lca(root.right, p, q);

        // If both subtrees contain the nodes, the current root is the lowest common ancestor
        if (left != null && right != null) {
            return root;
        }

        // If the left subtree doesn't contain the common ancestor, return the right subtree result
        return left != null ? left : right;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        Solution sol = new Solution();

        // Find the LCA of nodes with values 5 and 1
        TreeNode ans = sol.lca(root, 5, 1);
        if (ans != null) {
            System.out.println("LCA(5, 1) = " + ans.data);
        } else {
            System.out.println("LCA(5, 1) is not present in the tree");
        }

        // Find the LCA of nodes with values 5 and 4
        ans = sol.lca(root, 5, 4);
        if (ans != null) {
            System.out.println("LCA(5, 4) = " + ans.data);
        } else {
            System.out.println("LCA(5, 4) is not present in the tree");
        }
    }
}
