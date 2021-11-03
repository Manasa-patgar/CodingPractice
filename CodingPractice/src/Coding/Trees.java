package Coding;

import java.util.Stack;

public class Trees
{
    //3 5 2 1 4 6 7

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left =  null;
            this.right = null;
        }
}

public static int heightOfTree(Node root)
{
    int height = 0;

    if(root == null)
        return 0;

       int leftheight = heightOfTree(root.left) ;
       int rightheight = heightOfTree(root.right);


       height = Math.max(leftheight , rightheight ) + 1;

       return height;

}

public static void main(String args[])
{
//    int m = 100;
//    while(true)
//    {
//        if(m < 10)
//            break;
//        m = m - 10;
//    }
//
//    System.out.println(m);

    Node node1 = new Node(1);
    node1.right = new Node(3);
    node1.left = new Node(2);
    node1.left.right = new Node(4);
    node1.left.right.right = new Node(5);
    System.out.println(heightOfTree(node1));



}
}
