package JavaProgramming2021;

import java.util.Scanner;

public class Range_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(), R = sc.nextInt();
        for(int i=L;i<=R;i++){
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
