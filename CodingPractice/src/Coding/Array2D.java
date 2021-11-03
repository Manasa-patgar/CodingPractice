package Coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Array2D
{
    // 0 1 0
    // 1 1 1
    // 0 1 1


    public static int[][] addZero(int[][] matrix)
    {
        int R = matrix.length;
        int C = matrix[0].length;

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for(int i = 0; i< matrix.length; i++)
        {
            for(int j= 0; j< matrix[0].length; j++)
            {
                if( matrix[i][j] == 0)
                {
                   rows.add(i);
                   cols.add(j);
                }
            }
        }

        for(int i = 0; i< R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                if(rows.contains(i) || cols.contains(j))
                {
                    matrix[i][j] = 0;
                }
            }
        }
  return matrix;
    }


    public static void main (String args[])
    {
        int[][] arr = {{0,1,0 }, {1, 1, 1}, {0, 1,1}};
        int[][] result = addZero(arr);

        for(int i =0; i< result.length; i++)
        {
            for(int j =0 ; j< result[0].length; j++)
            {
                System.out.print(result[i][j]);
            }

            System.out.println(" ");
        }


    }

}
