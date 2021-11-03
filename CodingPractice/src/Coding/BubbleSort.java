package Coding;

public class BubbleSort
{

    //ip - 7 5 3 9 1 2
    //op - 1 2 3 5 7 9


    public static int[] bubbleSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            if(arr[i] > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return arr;

    }

    public static void main (String rgs[])
    {
        int[] result = bubbleSort(new int[]{7,5,3,9,1,2});
        for(int i : result)
        {
            System.out.println(i);
        }
    }
}
