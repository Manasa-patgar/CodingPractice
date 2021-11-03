package Coding;

public class PowerOfTwo
{
    //ip - 4
    //op - true

    public static boolean isPowerOfTwo(int num)
    {

        int pow = 2;
        int temp = num;
        int rem = 0;



//        while( temp != 1 && rem == 0)
//        {
//             temp = temp / pow;
//             rem = temp % 2;
//
//        }

        if(temp == 1 && rem == 0)
            return true;
        else
            return false;
    }

    public static boolean recur(int num)
    {
        boolean result = false;
        if(num/2 == 1 && num % 2 == 0)
           return true;
        else if( num % 2 == 1)
        {
            return false;
        }

        return recur(num / 2);

    }

    public static void main(String args[])
    {
        //System.out.println(isPowerOfTwo(100));
        System.out.println(recur(38));
    }
}
