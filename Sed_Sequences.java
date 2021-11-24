package JavaProgramming2021;

import java.util.Scanner;

public class Sed_Sequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();
            if(K > 0){
                int [] arr = new int[N];
                int sum = 0;
                for(int i=0;i<arr.length;i++){
                    arr[i] = sc.nextInt();
                    sum = sum + arr[i];
                }

                if(sum%K == 0){
                    System.out.println("0");
                }
                else{
                    System.out.println("1");
                }
            }
        }
        sc.close();
    }
}