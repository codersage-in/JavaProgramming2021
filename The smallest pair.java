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
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		while(N-->0) 
		{
			int x = sc.nextInt();
			int [] arr = new int[x];
			for(int i =0;i<x;i++) 
			{
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[0]+arr[1]);
		}
	}
}
