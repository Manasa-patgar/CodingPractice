package Coding;

public class ReverseLinkedList
{

    public static class Node
    {
        int val;
        Node next;

        Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }

    public static Node revereseList(Node node)
    {
        Node cur = node;
        Node prev = null;
        Node next = null;

        while(cur != null)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        node = prev;
        return node;
    }

    public static Node reverseLL(Node node)
    {
        Node cur = node;
        Node prev = null;

        while(cur!= null)
        {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        node = prev;
        return node;

    }

    public  static void main(String args[])
    {
        Node node = new Node(3);
        node.next = new Node(6);
        node.next.next = new Node(12);
        node.next.next.next = new Node(89);
        node.next.next.next.next = new Node(43);
        node.next.next.next.next.next = new Node(9);

        Node result = reverseLL(node);
        while(result != null)
        {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
