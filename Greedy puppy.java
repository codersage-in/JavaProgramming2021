/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0)
        {
            int n = s.nextInt();
            int k= s.nextInt();
            int maxc=0;
            for (int i=1;i<=k ; i++)
            {
                maxc=Math.max(maxc,n%i);
            } 
            System.out.println(maxc);
        }
	}
}
