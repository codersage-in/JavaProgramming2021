package JavaProgramming2021;

import java.util.Scanner;

public class The_Preparations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int M = sc.nextInt(), N = sc.nextInt(), K = sc.nextInt();
            int time = N*K;

            if(M > time){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
