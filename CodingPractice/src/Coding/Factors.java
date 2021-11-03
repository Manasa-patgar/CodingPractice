package Coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factors {

    public static long pthFactor(long n, long p) {
        // Write your code here

        List<Long> list = new ArrayList<>();
        for(long i = 1 ; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0){
                list.add(i);
                if(n/i != Math.sqrt(n))
                    list.add(n/i);
            }
        }

        Collections.sort(list);

        if( p <= list.size())
            return list.get((int) p - 1);
        else
            return 0;

    }

    public static void main(String args[])
    {
        System.out.println(pthFactor(10, 3));
    }

}

