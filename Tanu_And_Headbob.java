package JavaProgramming2021;

import java.util.Scanner;

public class Tanu_And_Headbob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int  N = sc.nextInt();
            String str = sc.next();
            if(str.contains("I"))
            {
                System.out.println("INDIAN");
            }else if(str.contains("Y"))
            {
                System.out.println("NOT INDIAN");
            }else
            {
                System.out.println("NOT SURE");
            }
        }
    }
}
