package Coding;

public class LinkedListEx
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

    Node head = null;

    public boolean checkSortedList(Node list)
    {

        Node curNode = list;
        if (curNode == null)
            return false;
        Node nextNode = curNode.next;

        if (curNode.data < nextNode.data)
        {
            if(nextNode.next != null)
            {
                curNode = nextNode;
               return checkSortedList(curNode);
            }
            else
            {
                return true;
            }

        }

        return false;
    }

    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[])
    {
        LinkedListEx linkedListEx = new LinkedListEx();
        for(int i = 7 ;i> 0; i--)
        {
            linkedListEx.push(i);
        }
        linkedListEx.printList();
        System.out.print(linkedListEx.checkSortedList(linkedListEx.head));
    }
}


