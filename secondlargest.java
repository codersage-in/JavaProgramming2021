package com.company;
import java.util.Scanner;
public class secondlargest
{
    public static void main (String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the no for finding SecondLargest: ");
        int t = Scan.nextInt();
        for (int i=0; i<t; i++){
            int A = Scan.nextInt();
            int B = Scan.nextInt();
            int C = Scan.nextInt();
            if(A>B && A<C || A<B && A>C){
                System.out.println("The second largest no is " + A);
            }
            else if(B>A && B<C || B<A && B>C){
                System.out.println("The second largest no is " + B);
            }
            else{
                System.out.println("The second largest no is " + C);
            }
        }
    }
}
