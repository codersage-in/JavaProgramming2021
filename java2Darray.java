package com.company;
import java.io.IOException;
import java.util.Scanner;
public class java2Darray {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[6][6];
        int prevsum = Integer.MIN_VALUE;
        int sum;
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                array[i][j] = sc.nextInt();
                if(i>1 && j>1)
                {
                    sum = array[i][j] + array[i][j-1] + array[i][j-2] + array[i-1][j-1] + array[i-2][j] + array[i-2][j-1] + array [i-2][j-2];
                    if(sum>prevsum)
                    {
                        prevsum = sum;
                    }
                }
            }
        }
        System.out.print(prevsum);
    }
}
