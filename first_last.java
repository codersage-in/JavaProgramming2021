package com.company;
import java.util.Scanner;
public class first_last
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("The number is: " + number);
        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);

        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+firstDigit);
    }
}