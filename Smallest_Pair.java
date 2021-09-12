package JavaProgramming2021;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest_Pair
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++)
        {
            int TN = sc.nextInt();
            int []number = new int[TN];
            for(int j=0;j<TN;j++)
            {
                number[j] = sc.nextInt();
            }

            int []sum = new int[TN];
           // sum[i] = 0;
            for(int l=0;l<TN;l++)
            {

                for (int k = l + 1; k < TN; k++) {
                    sum[i] = number[l] + number[k];
                    //System.out.println(sum[i]);
                }
            }
            Arrays.sort(sum);
            System.out.println(sum[0]);


        }
    }
}
