package JavaProgramming2021;

import java.util.Scanner;

public class Valid_Triangle_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        boolean b1 = ((b + c) > a) && ((c + a) > b) && ((a+b) > c);
        if(b1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();
    }
}
