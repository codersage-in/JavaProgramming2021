package com.company;
import java.util.Scanner;
public class chefandoperator{
    public static void main(String []ar){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no for input: ");
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a < b)
                System.out.println("A<B");
            if(a>b)
                System.out.println("A>B");
            if (a==b)
                System.out.println("A=B");
        }
    }
}