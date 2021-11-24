package JavaProgramming2021;

import java.util.Scanner;

public class Summer_Heat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int xa = sc.nextInt(), xb = sc.nextInt();
            int Xa = sc.nextInt(), Xb = sc.nextInt();

            int A = Xa/xa;
            int B = Xb/xb;

            System.out.println(A+B);
        }
        sc.close();
    }
}
