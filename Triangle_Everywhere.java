package JavaProgramming2021;

import java.util.Scanner;

public class Triangle_Everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b)
        {
            if (a == b && b == c)
                System.out.println("1");
            else if (a == b || b == c || c == a)
                System.out.println("2");
            else
                System.out.println("3");
        }
        else{
            System.out.println("-1");
        }

        sc.close();
    }
}
