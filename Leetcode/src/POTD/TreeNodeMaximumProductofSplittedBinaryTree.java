package POTD;

public class TreeNodeMaximumProductofSplittedBinaryTree {
    int val;
    TreeNodeMaximumProductofSplittedBinaryTree left;
    TreeNodeMaximumProductofSplittedBinaryTree right;

    TreeNodeMaximumProductofSplittedBinaryTree() {
    }

    public TreeNodeMaximumProductofSplittedBinaryTree(int val) {
        this.val = val;
    }

    public TreeNodeMaximumProductofSplittedBinaryTree(int val, TreeNodeMaximumProductofSplittedBinaryTree left, TreeNodeMaximumProductofSplittedBinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class SolutionMaximumProductSpilttedBinaryTree {
    static long SUM = 0;
    static long maxP = 0;
    static long MOD = 1000000007;

    public static void main(String[] args) {
        TreeNodeMaximumProductofSplittedBinaryTree root = new TreeNodeMaximumProductofSplittedBinaryTree(1);
        TreeNodeMaximumProductofSplittedBinaryTree n2 = new TreeNodeMaximumProductofSplittedBinaryTree(2);
        TreeNodeMaximumProductofSplittedBinaryTree n3 = new TreeNodeMaximumProductofSplittedBinaryTree(3);
        TreeNodeMaximumProductofSplittedBinaryTree n4 = new TreeNodeMaximumProductofSplittedBinaryTree(4);
        TreeNodeMaximumProductofSplittedBinaryTree n5 = new TreeNodeMaximumProductofSplittedBinaryTree(5);
        TreeNodeMaximumProductofSplittedBinaryTree n6 = new TreeNodeMaximumProductofSplittedBinaryTree(6);

        root.left = n2;
        root.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;

        SolutionMaximumProductSpilttedBinaryTree s = new SolutionMaximumProductSpilttedBinaryTree();
        s.printTree(root);

        int ans = s.maxProduct(root);
        System.out.println(ans);
    }

    static void printTree(TreeNodeMaximumProductofSplittedBinaryTree root) {
        if (root == null) {
            return;
        }

        System.out.println(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static int totalSum(TreeNodeMaximumProductofSplittedBinaryTree root) {
        if (root == null) {
            return 0;
        }

        int leftTreeSum = totalSum(root.left);
        int rightTreeSum = totalSum(root.right);

        return root.val + leftTreeSum + rightTreeSum;
    }

    public static long find(TreeNodeMaximumProductofSplittedBinaryTree root) {
        if (root == null) {
            return 0;
        }

        long leftSubTreeSum = find(root.left);
        long rightSubTreeSum = find(root.right);
        long subTreeSum = root.val + leftSubTreeSum + rightSubTreeSum;
        long remainingSubTreeSum = SUM - subTreeSum;

        maxP = Math.max(maxP, subTreeSum * remainingSubTreeSum);
        return subTreeSum;
    }

    public static int maxProduct(TreeNodeMaximumProductofSplittedBinaryTree root) {
        if (root == null) {
            return 0;
        }

        SUM = totalSum(root);
        find(root);
        return (int) (maxP % MOD);
    }
}
