package JavaProgramming2021;

import java.util.Scanner;

public class Secret_Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X1 = sc.nextInt(), X2 = sc.nextInt(), X3 = sc.nextInt();
            int V1 = sc.nextInt(), V2 = sc.nextInt();

            int all1 = Math.abs(X3-X1);
            int all2 = Math.abs(X3-X2);

            float t1 = (float)all1/V1;
            float t2 = (float)all2/V2;

            if(t1>t2){
                System.out.println("Kefa");
            }
            else if(t1<t2){
                System.out.println("Chef");
            }
            else{
                System.out.println("Draw");
            }
        }
        sc.close();
    }
}
