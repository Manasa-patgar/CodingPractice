package Coding;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

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

    public static void keepHighest()
    {
        HashMap<Integer, String> hashMap = new HashMap<>();
        int max =  Integer.MIN_VALUE;

        hashMap.put(17, "Manasa");
        hashMap.put(1, "Manasa");
        hashMap.put(2, "Smruthi");
        hashMap.put(3, "Vishnu");
        hashMap.put(4, "Bruno");
        hashMap.put(5, "Tusky");
        hashMap.put(12, "Manasa");
        hashMap.put(15, "Manasa");

        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.naturalOrder());

        for(Map.Entry<Integer,String> hp : hashMap.entrySet())
        {
            if(hp.getValue().equalsIgnoreCase("Manasa"))
            {
                q.add(hp.getKey());
            }
        }

        while(!q.isEmpty())
        {
            hashMap.remove(q.poll());
            if(q.size() == 1)
                break;
        }

        System.out.println(hashMap);

    }

    public static void main (String args[])
    {
      //  System.out.println(mostRepeated(new int[]{1,2,4, 5, 8,8,4}));
        keepHighest();
    }

}
