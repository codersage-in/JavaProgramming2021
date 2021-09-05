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
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0)
        {
            int n = s.nextInt();
            int i;
            int a[] = new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            if(a[0]==1 && a[n-1]==1)
            {
                if(a[n/2]==7 || a[(n+1)/2]==7)
                {
                    for(i=0;i<n/2;i++)
                    {
                        if(a[i] != a[n-i-1])
                        break;
                        if(a[i+1]-a[i] > 1)
                        break;
                    }
                }
            }
            if(i == n/2)
            System.out.println("yes");
            else
            System.out.println("no");
        }
        s.close();
	}
}
