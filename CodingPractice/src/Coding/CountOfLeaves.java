package Coding;

import java.util.*;

public class CountOfLeaves
{
    protected static class Node
    {
        int data;
        Node left =  null;
        Node right = null;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int countOfSingleParent(Node node)
    {
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        int count = 0;
        while(!stack.isEmpty())
        {
            boolean left = false;
            boolean right = false;
            Node temp = stack.pop();
            if(temp.left == null)
                left = true;
            if(temp.right == null)
                right = true;
            if(temp.left != null || temp.right != null)
            {
               stack.push(temp.left);
               stack.push(temp.right);
            }
            if(left || right)
                count++;

        }

        return count;
    }

    private static int countOfLeaves(Node root)
    {
        int count =0;
        Stack<Node> stack = new Stack<>();

        stack.push(root);
        while(!stack.isEmpty())
        {
            Node temp = stack.pop();

            if(temp.left == null && temp.right == null)
            {
                count++;
            }
             if(temp.left != null)
            {
                stack.push(temp.left);
            }
             if(temp.right != null)
            {
                stack.push(temp.right);
            }
        }

        return count;
    }

    public static List<Integer> getLonelyNodes(Node root) {
        List<Integer> result = new ArrayList<>();
        helper(result, root);
        return result;
    }

    private static void helper(List<Integer> result, Node currNode) {
        if (currNode == null) return;
        if (currNode.left != null && currNode.right == null) result.add(currNode.left.data);
        if (currNode.left == null && currNode.right != null) result.add(currNode.right.data);
        helper(result, currNode.left);
        helper(result, currNode.right);
    }
    public static void main(String args[])

    {
        Node node = new Node(10);
        node.left = new Node(8);
        node.right = new Node(12);
        node.left.right = new Node(5);
        node.right.left = new Node(7);
        node.right.right = new Node(13);
       // System.out.println(countOfLeaves(node));
        //System.out.println(countOfSingleParent(node));

        Node node1 = new Node(1);
        node1.right = new Node(3);
        node1.left = new Node(2);
        node1.left.right = new Node(4);
        node1.left.right.right = new Node(5);
        System.out.println(getLonelyNodes(node1));

    }

}
