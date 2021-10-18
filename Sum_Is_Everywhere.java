package JavaProgramming2021;

import java.util.Scanner;

public class Sum_Is_Everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long cnt = 0, mnt = 0;

        for(int i=0;i<2*N;i++){
            long n = i+1;
            if(n%2 == 0){
                cnt = cnt+n;
            }
            else{
                mnt = mnt+n;
            }
        }

        System.out.println(mnt +" "+cnt);
        sc.close();
    }
}
