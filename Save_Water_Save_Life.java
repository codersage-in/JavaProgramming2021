package JavaProgramming2021;

import java.util.Scanner;

public class Save_Water_Save_Life {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int x = sc.nextInt(), y = sc.nextInt();
            int C = sc.nextInt();

            int sum = x+(y/2);
            int result = sum*N;

            if(result <= C){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
