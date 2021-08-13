package com.company;
import java.util.Scanner;
public class javastringintroduction
{

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int C=A.length()+B.length();
        System.out.print(C);
        System.out.println();
        int D=A.compareTo(B);
        if(D>0)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
        System.out.println();
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
    }
}



