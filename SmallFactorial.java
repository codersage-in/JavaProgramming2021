package JavaProgramming2021;

import java.util.Scanner;

public class SmallFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, number;
        num = sc.nextInt();
        if (num >= 1 && num <= 100) {
            for (int i = 0; i < num; i++) {
                number = sc.nextInt();
                int fact = 1;
                if (number >= 1 && number <= 100) {
                    for (int j = 0; j < number; j++) {
                        fact = fact * j;
                    }
                    System.out.println(fact);
                }
            }
        }
    }
}
