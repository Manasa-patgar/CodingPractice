package Coding;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class SortArray
{

    //ip - 0 1 2 1 1 2 2
    //op - 0 1 1 1 2 2 2

    //ip - 8 5 6 1 2 4
    //op - 5

    //ip - 8 5 6 1 2 4
    //sum = 3

    public static int[] sortArray(int[] arr)
    {
        for(int i = 0; i< arr.length; i++)
        {
            int j = i+1;
            while (j < arr.length)
            {
                if(arr[j] < arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j++;
            }
        }

        return arr;
    }

    public static int[] sortOneTwo(int[] arr)
    {
        int countOfOne = 0;
        int countOfZero = 0;
        for(int i : arr)
        {
            if(arr[i] == 1)
            {
                countOfOne++;
            }
            else if(arr[i] == 0)
            {
                countOfZero++;
            }
        }

        int i = 0;
            while(countOfZero > 0)
            {
                arr[i] = 0;
                i++;
                countOfZero--;
            }
            while (countOfOne > 0)
            {
                arr[i] = 1;
                i++;
                countOfOne--;
            }

            return arr;

    }

    public static int findKLargest(int[] arr, int k)
    {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : arr)
        {
            heap.add(i);
        }
        while(k > 1)
        {
            heap.remove();
            k--;
        }
        return heap.peek();
    }

    public static void find2Sum(int[] arr, int sum)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr)
        {
            int diff = sum - i;

            if(set.contains(diff))
            {
                System.out.print(diff + " " + i);
            }
            else
            {
                set.add(i);
            }
        }
    }

    public static void main(String args[])
    {
//        int result[] = sortOneTwo(new int[]{0,1,0,1,1,0,0});
//        for(int i : result)
//        {
//            System.out.print(i);
//        }

       // System.out.print(findKLargest(new int[]{8, 2, 6, 1, 5, 4}, 3));
        find2Sum(new int[]{8, 2, 6, 1, 5, 4}, 3);
    }
}
