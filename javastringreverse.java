package com.company;
import java.util.Scanner;
public class javastringreverse
{
    public static void main(String[] args)
    {
        String s = "";
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        for (int i = 0; i < A.length(); i++)
        {
            s = s + A.charAt(A.length() - 1 - i);
        }
        if (s.compareToIgnoreCase(A) == 0)
        {
            System.out.println("Yes");

        }
        else
        {
            System.out.println("No");
        }
    }
}