package JavaProgramming2021;

import java.util.Scanner;

public class Round_Robin_Ranks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();

            int ans = (2*N-K-1)/2;
            System.out.println(2*ans);
        }
        sc.close();
    }
}
