import java.util.*;
//import java.lang.*;
//import java.io.*;

class ReverseNumber
{
    public static void main (String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 0; i < a; i++)
        {
            int num, rev = 0, digit;
            num = input.nextInt();
            while(num != 0)
            {
                digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }
            System.out.println("Reversed number is " + rev);
        }
        input.close();
    }
}