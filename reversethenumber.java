/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n , rev , a=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int reverse[]= new int[n];

        for(int i=0 ; i<n ; i++)
        {
            reverse[i]=sc.nextInt();
        }
        for(int i=0 ; i<n ;i++)
        {
            a=0 ;
            while(reverse[i]!=0)
            {
                rev=reverse[i]%10 ;
                a=a*10 + rev ;
                reverse[i]=reverse[i]/10 ;
            }
            System.out.println(a);
        }



    }
}
