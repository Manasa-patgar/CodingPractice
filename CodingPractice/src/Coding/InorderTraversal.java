package Coding;

import java.util.Stack;

public class InorderTraversal
{

    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data)
        {
            this.data = data;
            left = right = null;
        }
    }

    public static  void inOrder(TreeNode root)
    {
        if(root == null)
            return;

        Stack<TreeNode> s = new Stack<TreeNode>();

        TreeNode cur = root;

        while(cur != null || s.size() > 0)
        {
            while (cur != null)
            {
                s.push(cur);
                cur = cur.left;
            }

            cur = s.pop();

            System.out.print(cur.data + " ");

            cur = cur.right;
        }
    }
    public static void main(String args[])
    {
        TreeNode node = new TreeNode(15);
        node.left = new TreeNode(9);
        node.right = new TreeNode(16);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(10);
        node.right = new TreeNode(16);
        node.right.left = new TreeNode(14);
        node.right.right = new TreeNode(18);
        inOrder(node);

    }
}
