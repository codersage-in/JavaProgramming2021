package com.company;
import java.util.Scanner;
public class reminder{
    public static void main(String []ar){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no-1: ");
        int i = scan.nextInt();
        System.out.print("Enter the no-2: ");
        int j = scan.nextInt();
        int k = i % j;
        System.out.print("The reminder of two number is: " + k);

    }
}