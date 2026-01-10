package POTD;


import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(7);
        treeNode.right = new TreeNode(0);

        // level 3 has maximum sum like = 7 + (-8) + 9 = 8 []
        treeNode.left.left = new TreeNode(7);
        treeNode.left.right = new TreeNode(-8);
        treeNode.right.right = new TreeNode(9);

        // Call maxLevelSum method
        Solution s = new Solution();
        int levelSum = s.maxLevelSum(treeNode);
        System.out.println(levelSum);


    }

    public static int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;

        int maxSum = Integer.MIN_VALUE;
        int resultLevel = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int currentLevel = 1;

        while (!queue.isEmpty()) {
            int count = queue.size();
            int sum = 0;
            while (count-- > 0) {
                TreeNode temp = queue.poll();
                sum = sum + temp.val;

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                resultLevel = currentLevel;
            }
            currentLevel++;
        }

        return resultLevel;
    }
}