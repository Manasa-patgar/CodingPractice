package Coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Randoms
{
    public static String printGreatestNumber(int[] arr)
    {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        String number = "";
        for(int i : arr)
            q.add(i);

        while (!q.isEmpty())
        {
            number = number + q.poll();
        }

        return number;

    }

    public static void main (String args[])
    {
        System.out.println(printGreatestNumber(new int[]{1,6,2,8,9,3}));
    }
}
