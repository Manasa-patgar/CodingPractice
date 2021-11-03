package Coding;

import java.util.ArrayList;
import java.util.List;

public class TreeRightSideView
{
    public static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val)
        {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static List<Integer> result = new ArrayList<>();

   static int diameter = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        longestPath(root);
        return diameter;
    }

    private static int longestPath(TreeNode node)
    {
        if(node == null)
            return 0;

        int leftPath = longestPath(node.left);
        int rightPath = longestPath(node.right);

        diameter = Math.max(diameter, leftPath + rightPath);

        return Math.max(leftPath, rightPath) + 1;
    }

    public static List<Integer> rightSide(TreeNode root)
    {
        if(root == null)
            return new ArrayList<>();

        traverse(root, 1, result);
        return result;

    }

    private static void traverse(TreeNode node, int level, List<Integer> result)
    {
        if(node == null)
            return;

        while(level > result.size())
        {
            result.add(node.val);
        }

        traverse(node.right, level+1, result);
        traverse(node.left, level+1, result);
    }


    public static void main(String args[])
    {
        TreeNode node = new TreeNode(15);
        node.left = new TreeNode(9);
        node.right = new TreeNode(16);
        node.left.right = new TreeNode(10);
        node.left.left = new TreeNode(3);
        node.right.left = new TreeNode(14);
        node.right.right = new TreeNode(18);
        //System.out.print(rightSide(node));
        System.out.println(diameterOfBinaryTree(node));

    }

}
