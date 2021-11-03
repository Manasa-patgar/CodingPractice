package Coding;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LevelOrderTraversal
{
    /**
     * Definition for a binary tree node. */
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


        public static List<List<Integer>> levelOrderBottom(TreeNode root)
        {
            List<List<Integer>> levels = new ArrayList<List<Integer>>();

            ArrayDeque<TreeNode> nextLevel = new ArrayDeque()
            {{
                offer(root);
            }};
            ArrayDeque<TreeNode> curLevel = new ArrayDeque();

            while (!nextLevel.isEmpty())
            {
                curLevel = nextLevel.clone();
                nextLevel.clear();
                levels.add(new ArrayList<Integer>());

                for (TreeNode node : curLevel)
                {
                    levels.get(levels.size() - 1).add(node.val);

                    if (node.left != null)
                        nextLevel.offer(node.left);

                    if (node.right != null)
                        nextLevel.offer(node.right);
                }
            }

            Collections.reverse(levels);
            return levels;
        }

        public static void main(String args[])
        {
            TreeNode node = new TreeNode(3);
            node.left = new TreeNode(9);
            node.right = new TreeNode(20);
            node.right.left = new TreeNode(15);
            node.right.right = new TreeNode(7);

            System.out.println(levelOrderBottom(node));
        }
}
