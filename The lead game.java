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
		int n = sc.nextInt();
		int arr[] = new int[n];
		int win=0;
		int max=0;
		int p1=0;
		int p2=0;
		for(int i=0 ; i<n ; i++)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    p1 = p1+a;
		    p2 = p2+b;
		    if(Math.abs(p1-p2) > max)
		    {
		        max = Math.abs(p1-p2);
		        if(a>b)
		        {
		            win=1;
		        }
		        else{
		            win=2;
		        }
		    }
		}
		System.out.println(win + " " + max);
		}
	}

