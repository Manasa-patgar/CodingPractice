package Coding;

public class BTMaxPathSum
{

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

      static  int maxSum = Integer.MIN_VALUE;

        public static int maxGain(TreeNode node)
        {
            if(node == null)
                return 0;

            int leftGain = Math.max(maxGain(node.left), 0);
            int rightGain = Math.max(maxGain(node.right), 0);

            int newPath = node.val + leftGain + rightGain;

            maxSum = Math.max(maxSum, newPath);

            return node.val + Math.max(leftGain, rightGain);
        }
        public static int maxPathSum(TreeNode root) {
            maxGain(root);
            return maxSum;

        }

        public static void main(String args[])
        {
            TreeNode node = new TreeNode(-10);
            node.left = new TreeNode(9);
            node.right = new TreeNode(20);
            node.right.left = new TreeNode(15);
            node.right.right = new TreeNode(7);

            System.out.println(maxPathSum(node));
        }
}
