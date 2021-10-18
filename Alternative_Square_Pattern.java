package JavaProgramming2021;

import java.util.Scanner;

public class Alternative_Square_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int j=0;
        for(int i=1;i<=N;i++){
            if(i%2 != 0){
                while(j++<5){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            else{

            }
        }
        sc.close();
    }
}
