package JavaProgramming2021;

import java.util.Scanner;

public class Reverse_Me {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int []arr = new int[N];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}
