package Coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringOccurence
{

    public static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int val)
        {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode add(ListNode a, ListNode b){
        ListNode result = new ListNode(0);
        ListNode dummy = result;

        ListNode cur1 = a;
        ListNode cur2 = b;

        int carry = 0;

        while(cur1 != null && cur2 != null)
        {

            int sum = cur1.val + cur2.val + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);

            dummy.next = newNode;
            dummy = dummy.next;

            cur1 = cur1.next;
            cur2 = cur2.next;

        }

        if(carry > 0)
        {
            dummy.next = new ListNode(carry);
        }

      return result.next;

    }

    public static char firstChar(String s)
    {
        HashSet<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();
        char[] str = s.toCharArray();

        for(char c : str)
        {
            if(set.contains(c))
            {
                list.remove(Character.valueOf(c));
            }
            else
            {
                set.add(c);
                list.add(c);
            }
        }

        return list.get(0);
    }
    public  static  void main(String args[])
    {
      //  System.out.println(firstChar("efficient"));
        ListNode node1 = new ListNode(3);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(1);

        ListNode node2 = new ListNode(3);
        node2.next= new ListNode(6);
        node2.next.next = new ListNode(9);

       ListNode result = add(node1, node2);
       ListNode temp = result;
       while (temp != null)
       {
           System.out.println(temp.val);
           temp = temp.next;
       }



    }
}
