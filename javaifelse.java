package com.company;
import java.util.Scanner;
public class javaifelse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0) {
            System.out.print("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.print("Not Weird");
        } else if (N >= 6 && N <= 15) {
            System.out.print("Wired");
        } else if (N >= 16 && N <= 20) {
            System.out.print("Weird");
        } else if (N >= 21) {
            System.out.print("Not Weird");
        } else {

        }
        scanner.close();
    }
}