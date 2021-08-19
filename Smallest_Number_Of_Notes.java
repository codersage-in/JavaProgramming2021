package JavaProgramming2021;

import java.util.Scanner;

public class Smallest_Number_Of_Notes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int []arr = {1,2,5,10,50,100};
        for(int i=0;i<N;i++){
            int sum = 0;
            int num = input.nextInt();
             for(int j=5;j>=0;j--){
                 sum += num/arr[j];
                 num = num%arr[j];
             }
            System.out.println(sum);
        }
    }
}
