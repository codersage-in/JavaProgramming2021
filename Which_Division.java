package JavaProgramming2021;

import java.util.Scanner;

public class Which_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int Rating = sc.nextInt();
            if(Rating >= 2000){
                System.out.println("1");
            }
            else if(Rating >= 1600 && Rating < 2000){
                System.out.println("2");
            }
            else if(Rating < 1600){
                System.out.println("3");
            }
        }
        sc.close();
    }
}
