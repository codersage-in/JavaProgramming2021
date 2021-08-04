package com.company;
import java.util.Scanner;
public class factorials{
    public static void main(String []ar){
        int i,fact = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to find factorials: ");
        int n = scan.nextInt();
        for(i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+ n +" is: "+fact);
    }
}
