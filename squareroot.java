package com.company;
import java.util.Scanner;
public class squareroot {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = scan.nextDouble();
        double squareroot = Math.pow(n, 0.5);
        System.out.println("The Square of a number  " + n + " = " + squareroot);
    }
}