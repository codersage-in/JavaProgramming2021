import java.util.*;
import java.lang.*;
import java.io.*;


public class Helping_Chef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++)
        {
            int num = sc.nextInt();

            if  (num < 10)
                System.out.println("Thanks for helping Chef!");
            else
                System.out.println("-1");
        }


    }
}