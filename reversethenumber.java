package com.company;

import java.util.Scanner;

public class reversethenumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int reverse = 0;
        System.out.print("Enter the number to reverse: ");
                int number = scan.nextInt();
                while(number != 0)
                {
                    int remainder = number % 10;
                     reverse = reverse * 10 + remainder;
                    number = number/10;
                }
        System.out.println("The reverse of the given number is: " + reverse);
            }

    }
