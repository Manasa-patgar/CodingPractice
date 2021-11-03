package Coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Matrix
{
    public static long calculatePossibleCombinations(String inputStr) {
        char[] str = inputStr.toCharArray();
        int n = str.length;

        int[] count = new int[n+1];
        count[0] = 1;
        count[1] = 1;
        if(str[0] == '0')
        {
            return 0;
        }
        for(int i = 2; i <= n; i++)
        {
            count[i] = 0;

            if(str[i - 1] < '0')
            {
                count[i] = count[i - 1];
            }

            if(str[i - 1] == '1' || (str[i - 2] == '2' && str[i -1] < '7'))
                count[i] += count[i - 2];

            if(str[i - 2] == '1' || (str[i - 2] == '2' && str[i - 1] < '7'))
                count[i] += count[i - 2];
        }
        for(int i : count)
        {
            System.out.println(i);
        }
        return count[n];

    }



    static int countSpecialElements(List<List<Integer>> matrix) {

        if(matrix.size() == 0 || matrix == null)
            return -1;
        Map map = new HashMap<>();



        for(int i = 0; i< matrix.size(); ++i)
        {
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;
            for(int j = 0; j < matrix.get(0).size();++j)
            {
                minVal = Math.min(minVal, matrix.get(i).get(j));
                maxVal = Math.max(maxVal, matrix.get(i).get(j));
            }
            if(map.containsKey(minVal) && map.get(minVal).equals("minrow"))
            {
                return -1;
            }
            else
            {
                map.put(minVal, "minrow");
            }
            if(map.containsKey(maxVal) && map.get(maxVal).equals("maxrow"))
            {

                return -1;
            }
            else
            {
                map.put(maxVal, "maxrow");
            }

        }

        for(int j = 0; j < matrix.get(0).size();++j)
        {
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;

            for(int i = 0; i< matrix.size(); ++i)
            {
                minVal = Math.min(minVal, matrix.get(i).get(j));
                maxVal = Math.max(maxVal, matrix.get(i).get(j));
            }

            if(map.containsKey(minVal) && map.get(minVal).equals("mincol"))
            {

                return -1;
            }
            else
            {
                map.put(minVal, "mincol");
            }
            if(map.containsKey(maxVal) && map.get(maxVal).equals("maxcol"))
            {

                return -1;
            }
            else
            {
                map.put(maxVal, "maxcol");
            }

        }

//        for(int val : minSet)
//        {
//            if(maxSet.contains(val));
//            return -1;
//        }
        return  map.size();

    }

    public static void main (String args[])
    {
        List<List<Integer>> matrix = new ArrayList<>();
        List list =  new ArrayList();
        list.add(1);
        list.add(3);
        list.add(4);
        matrix.add(0,list);
        List list1 = new ArrayList();
        list1.add(5);
        list1.add(2);
        list1.add(9);
        matrix.add(1, list1);
        List list2 = new ArrayList();
        list2.add(8);
        list2.add(7);
        list2.add(6);
        matrix.add(2, list2);

       // System.out.println(countSpecialElements(matrix));

        System.out.println(calculatePossibleCombinations("2101"));
    }
}
