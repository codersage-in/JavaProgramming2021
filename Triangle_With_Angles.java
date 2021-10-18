package JavaProgramming2021;

import java.util.Scanner;

public class Triangle_With_Angles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b , c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if((a + b + c) == 180 && a > 0 && b > 0 && c > 0)
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        sc.close();
    }
}
