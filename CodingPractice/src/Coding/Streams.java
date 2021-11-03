package Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Streams
{

    // list<Integer>
    // returns sum of all integers
    //even integers
    //odd integers

    public static int calculate(List<Integer> integerList, Predicate<Integer> condition)
    {
        int sum;

        if(condition != null)
         sum =integerList.stream().filter(condition).reduce(0, Integer::max);
        else
            sum = integerList.stream().reduce(null, Integer::min);

        return sum;

    }
    public static void main(String args[])
    {

        Predicate<Integer> conditionEven = (i) -> i % 2 == 0;
        Predicate<Integer> conditionOdd = (i) -> i % 2 == 1;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       System.out.println(calculate(list, conditionEven));
        System.out.println(calculate(list, conditionOdd));
        System.out.println(calculate(list, null));

    }

}
