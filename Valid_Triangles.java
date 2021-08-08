package JavaProgramming2021;

import java.util.Scanner;

public class Valid_Triangles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for(int i=0;i<N;i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            if((A + B + C) == 180){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
