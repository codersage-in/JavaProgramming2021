/* package codechef; // don't place package name! */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A<B)
            {
                System.out.println("<");
            }
            else if(A>B)
            {
                System.out.println(">");
            }
            else
            {
                System.out.println("=");
            }
        }
    }
}
