package com.company;
import java.util.Scanner;
public class helping_chef{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for input: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if(k<10){
                System.out.println("Thanks for helping Chef!");
            }
            else {
                System.out.println("-1");
            }
        }

    }
}