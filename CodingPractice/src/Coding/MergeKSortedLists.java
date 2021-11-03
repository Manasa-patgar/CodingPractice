package Coding;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists
{

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public static ListNode mergeKSortedLists(ListNode[] nodes)
  {
        if(nodes == null || nodes.length == 0)
            return null;

//      PriorityQueue<ListNode> queue = new PriorityQueue<>(nodes.length, new Comparator<ListNode>()
//      {
//          @Override
//          public int compare(ListNode o1, ListNode o2)
//          {
//              if(o1.val < o2.val)
//               return -1;
//              else if (o1.val == o2.val)
//                  return 0;
//              else
//                  return 1;
//          }
//      });

      PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b) -> a.val - b.val);

      ListNode dummy = new ListNode(0);
      ListNode tail = dummy;

      for(ListNode node : nodes)
      {
          if(node != null)
          queue.add(node);
      }

      while (!queue.isEmpty())
      {
          tail.next = queue.poll();
          tail = tail.next;

          if(tail.next != null)
              queue.add(tail.next);
      }

      return dummy.next;
  }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones)
            heap.add(i);

        while(heap.size() > 1)
        {
            int stone1 = heap.remove();
            int stone2 = heap.remove();

            if(stone1 != stone2)
            {
                heap.add(stone1 - stone2);
            }
        }

        return heap.isEmpty() ? 0 : heap.remove();
    }

  public static void main(String args[])
  {
      ListNode node1 = new ListNode(1);
      node1.next = new ListNode(4);
      node1.next.next = new ListNode(5);

      ListNode node2 = new ListNode(1);
      node2.next = new ListNode(3);
      node2.next.next = new ListNode(4);

      ListNode node3 = new ListNode(2);
      node3.next = new ListNode(6);

      ListNode[] nodes = new ListNode[3];
      nodes[0] = node1;
      nodes[1] = node2;
      nodes[2] = node3;

//     ListNode result = mergeKSortedLists(nodes);
//     ListNode temp = result;
//     while (temp.next != null)
//     {
//         System.out.println(temp.val);
//         temp = temp.next;
//     }

     System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));

  }
}
