package Coding;

public class NumberOfIslands
{
    public static int numOfIslands(int matrix[][])
    {
        if(matrix.length == 0 || matrix == null)
          return 0;

        int numOfIslands = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j =0; j< matrix[0].length;j++)
            {
                if(matrix[i][j] == 1)
                {
                 ++numOfIslands;
                 dfs(i, j, matrix);
                }
            }
        }

        return numOfIslands;

    }

    private static void dfs(int row, int col, int[][] matrix)
    {
        if( row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] == 0)
            return;

        matrix[row][col] = 0;

        dfs(row - 1, col, matrix);
        dfs(row + 1, col, matrix);
        dfs(row, col - 1 , matrix);
        dfs(row, col + 1, matrix);
    }

    public static void main(String args[])
    {
        int[][] arr = {{1,1,0,0,0 }, {1,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,1}};
        System.out.println(numOfIslands(arr));
    }
}
