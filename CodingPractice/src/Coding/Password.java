package Coding;

import java.util.*;
import java.util.function.Consumer;

public class Password
{

    public static long findPasswordStrenght(String password)
    {
        if(password == null || password.length() == 0)
            return 0;

        long count = password.length();

        HashSet<Character> set = new HashSet<>();

        for(int window = 2; window <= password.length(); window++)
        {
            int i = 0;
            int j = window - 1;
            while (j < password.length())
            {
                set.clear();
                int k = i;
                while (k <= j && k < password.length())
                {
                    char[] ch = password.toCharArray();
                    set.add(ch[k]);
                    k++;
                }
                count = count + set.size();
                i++;
                j++;
            }
        }

        return count;

//        long count = 0;
//
//        HashSet<String> chars = new HashSet<>();
//
//        for(int i = 0; i< password.length(); i++)
//        {
//            String temp = "";
//            HashSet<Character> set = new HashSet<>();
//            for(int j = i; j < password.length(); j++)
//            {
//                temp = temp + password.charAt(j);
//                set.add(password.charAt(j));
//
//                if(!chars.contains(temp))
//                {
//                    chars.add(temp);
//                    count += set.size();
//                }
//                else if(temp.length() == 1 && chars.contains(temp))
//                {
//                    count++;
//                }
//            }
//
//        }




    }


    public static int maxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {
        // Write your code here
        System.out.println(wallPositions);
        System.out.println(wallHeights);
        int result = 0;
        int wallSize = wallPositions.size();
        for(int i = 0; i< wallSize - 1; i++)
        {
            int heightDiff = Math.abs((wallHeights.get(i+1) - wallHeights.get(i)));
            int gap = wallPositions.get(i+1) - wallPositions.get(i) -1;
            int max = 0;

            if(gap > heightDiff)
            {
                int low = Math.max(wallHeights.get(i + 1), wallHeights.get(i)) + 1;

                int remGap = gap - heightDiff - 1;
                max = low + remGap / 2;
            }
            else
            {
                max = Math.min(wallHeights.get(i+1), wallHeights.get(i)) + gap;
            }

            result = Math.max(result, max);
        }

        return result;

    }

    public static void main(String args[])
    {
        // System.out.println(findPasswordStrenght(new String("good")));
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("carrot");
        pq.add("apple");
        pq.add("banana");
        System.out.println(pq.poll() + " "+ pq.peek());

        Locale.setDefault(Locale.JAPAN);
        Currency c  = Currency.getInstance("JPY");
        System.out.println(c.getSymbol());

        // Get and print the symbol of the currency
       // int locale = cur.getNumericCode();
       // System.out.println(cur);
       // String symbol = cur.getSymbol(Locale.US);


        //System.out.println("Currency symbol is: " + symbol);

       // System.out.println(maxHeight(Arrays.asList(4, 5, 6, 9, 10, 11, 12, 13, 14), Arrays.asList(20, 22, 11, 14, 14, 21, 19, 14, 23)));
    }
}
