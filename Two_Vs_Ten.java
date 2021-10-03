package JavaProgramming2021;

import java.util.Scanner;

public class Two_Vs_Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt();
            if(X%10 == 0){
                System.out.println("0");
            }
            else{
                X = X*2;
                if(X%10 == 0){
                    System.out.println("1");
                }
                else{
                    System.out.println("-1");
                }
            }
        }
        sc.close();
    }
}
