package JavaProgramming2021;

import java.util.Scanner;

public class Shoe_Fit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
            if((A == 0 && B == 0 && C == 0) || (A == 1 && B == 1 && C == 1)) {
                System.out.println("0");
            }
            else{
                System.out.println("1");
            }
        }
        sc.close();
    }
}
