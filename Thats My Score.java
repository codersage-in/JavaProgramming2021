/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
	    int cases = input.nextInt();
	    int a,b,c;
	    while(cases>0)
	    {
	        a = input.nextInt();
	        int[] arr = new int[20];
	        int count = 0;
	        for(int i=0;i<a;i++)
	        {
	            b = input.nextInt();
	            c = input.nextInt();
	            if(c>arr[b]) arr[b] = c;
	            
	        }
	        for(int i=1;i<9;i++)
	        {
	            count = count + arr[i];
	        }
	        System.out.println(count);
	        count = 0;
	        cases--;
	        
	    }
	}
}
