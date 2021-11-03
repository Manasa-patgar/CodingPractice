package Coding;

public class MergeKSortedLinkedLists
{
    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

   static Node head = null;
   static Node cur = null;

    public static void addLinkedList(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            cur = head;
        }
        else
        {
            cur.next = newNode;
            cur = cur.next;
        }
    }

    public static void printLinkedList()
    {
        Node temp = head;
        while( temp != null)
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;

        }
        System.out.print("NULL");
    }

    public static void main(String args[])
    {
        for(int i = 1; i<=5 ; i++)
        {
            addLinkedList(i);
        }
        for(int i = 6; i <=10; i++)
        {
            addLinkedList(i);
        }
        printLinkedList();
    }
}
