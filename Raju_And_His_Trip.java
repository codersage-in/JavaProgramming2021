package JavaProgramming2021;

import java.util.Scanner;

public class Raju_And_His_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if((N%5 == 0) || (N%6 == 0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}