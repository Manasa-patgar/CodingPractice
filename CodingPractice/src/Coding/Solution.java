package Coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {

            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    static int getNextInt(int num)
    {
        int totalSum = 0;
        while(num > 0)
        {
            int delta = num % 10;
            num = num / 10;
            totalSum += delta * delta;
        }

        return totalSum;
    }
    static long solve(int l, int r){
        // Your code goes here
        long sum = 0;
        for(int i = l; i <= r; i++)
        {
            int cur = i;
            while(cur != 1 && cur != 4)
            {
                cur = getNextInt(cur);
            }

            if(cur == 1)
            {
                sum += i;
            }

        }

        return sum;
    }
}