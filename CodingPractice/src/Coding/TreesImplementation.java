package Coding;

import java.util.ArrayDeque;
import java.util.Queue;

// 2
public class TreesImplementation
{

    public static class TreeNode
    {
        int val;
        TreeNode[] child;

        TreeNode(int val)
        {
            this.val = val;
            this.child = null;
        }
    }

   static TreeNode head = null;

    public static void insertTree(int val, int root)
    {
        TreeNode node = new TreeNode(val);
        Queue<TreeNode> queue = new ArrayDeque<>();
        Queue<TreeNode[]> queue1 = new ArrayDeque<>();
        if(head == null)
        {
            head = node;
            return;
        }
        queue.add(head);
        while(! queue.isEmpty())
        {

                TreeNode curNode = queue.poll();
                if (curNode.val == root)
                {
                    curNode.child = new TreeNode[] { new TreeNode(val) };
                    return;
                }
                queue1.add(curNode.child);

        }
    }

    public static void main(String[] args)
    {

        insertTree(3, 3);
        insertTree(5, 3);
        insertTree(6, 3);
        insertTree(8, 6);

    }
}
