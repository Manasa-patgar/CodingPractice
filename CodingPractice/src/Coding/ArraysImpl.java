package Coding;

import java.util.HashMap;
import java.util.Map;

public class ArraysImpl
{

    public static int mostRepeated(int[] arr)
    {
        int number = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
        {
                map.put(i, map.getOrDefault(i, 0) + 1);
        }



        for(Map.Entry<Integer, Integer> hp : map.entrySet())
        {
            if(max < hp.getValue())
            {
                max = hp.getValue();
                number = hp.getKey();
            }
        }

        return number;
    }

    public static void main (String args[])
    {
        System.out.println(mostRepeated(new int[]{1,2,4, 5, 8,8,4}));
    }
}
