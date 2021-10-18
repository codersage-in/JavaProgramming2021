package JavaProgramming2021;

import java.util.Scanner;

public class Reverse_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=N-i;j++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
