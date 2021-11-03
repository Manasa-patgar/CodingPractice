package Coding;

public class ArraySorting
{

    //ip arr1 - {1, 5, 8, 9, 10, 13, 15, 20, 21}
    // arr2 -   {3, 4, 5, 7, 9, 30}


    public static int[] mergeTwoArrays(int[] arr1, int[] arr2)
    {
        int[] result = new int[arr1.length + arr2.length];
        int i_arr1 = 0;
        int i_arr2 = 0;
        int j = 0;

        while(i_arr1 < arr1.length && i_arr2 < arr2.length)
        {

            if(arr1[i_arr1] < arr2[i_arr2])
            {
                result[j] = arr1[i_arr1];
                j++;
                i_arr1++;
            }
            else if(arr1[i_arr1] > arr2[i_arr2])
            {
                result[j] = arr2[i_arr2];
                i_arr2++;
                j++;
            }
            else if(arr1[i_arr1] == arr2[i_arr2])
            {
                result[j] = arr1[i_arr1];
                i_arr1++;
                j++;
            }

        }
        if(i_arr1 == arr1.length && i_arr2 < arr2.length)
        {
            result[j] = arr2[i_arr2];
            j++;
            i_arr2++;
        }
        else if (i_arr2 == arr2.length && i_arr1 < arr1.length)
        {
            result[j] = arr1[i_arr1];
            j++;
            i_arr1++;
        }

        return result;
    }

    public static void main(String args[])
    {
        int[] result = mergeTwoArrays(new int[]{1, 5, 8, 9, 10, 13, 15, 20, 21}, new int[]{3, 4, 5, 7, 9, 30});
        for(int i : result)
        {
            System.out.println(i);
        }
    }
}
