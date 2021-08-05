package com.company;

import java.util.Scanner;
public class packagingcupcakes
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of cupcakes: ");
        int t =input.nextInt();
        for(int i =0;i<t;i++){
            System.out.print("Enter the amount: ");
            int a  = input.nextInt();
            int c = (a/2) + 1;
            System.out.println("The leftover cupcakes is: " + c );
        }

    }
}
