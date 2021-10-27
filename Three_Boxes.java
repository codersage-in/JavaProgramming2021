package JavaProgramming2021;

import java.util.Scanner;

public class Three_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            int cnt = 1;
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
            if(A<=B && B<=C && C<=D){
                if((A+B+C) <= D){
                    System.out.println(cnt);
                }
                else if(((A+B) <= D) || ((A+C) <= D)){
                    System.out.println(cnt+1);
                }
                else{
                    System.out.println(cnt+2);
                }
            }
        }
        sc.close();
    }
}
