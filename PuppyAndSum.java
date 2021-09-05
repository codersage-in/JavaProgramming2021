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
		    int d = s.nextInt();
		    int n = s.nextInt();
		    for(int i=1;i<=d;i++)
		    {
		        int sum = 0;
		        while(n > 0)
    		    {
    		        sum+=n;
    	            n--;
    		    }
    		    n = sum;
		    }
		    System.out.println(n);
		}
	}
}
