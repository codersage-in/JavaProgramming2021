/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int difference=0;
            int temp=0;
            if(n<m)
            {
                temp=m-n;
            }else if(n>m)
            {
                temp=n-m;
            }
            difference=temp-k;
            if(difference<0)
            {
                difference=0;
            }
            System.out.println(difference);
        }
	}
}
