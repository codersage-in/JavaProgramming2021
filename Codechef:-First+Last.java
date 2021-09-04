/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] num=new String[n];
		for(int i=0;i<n;i++)
		{
		    num[i]=sc.next();
		}
		for(int j=0;j<n;j++)
		{
		    int sum=0;
		    int first=num[j].charAt(0)-'0';
		    int last=num[j].charAt(num[j].length()-1)-'0';
		    sum=first+last;
		    System.out.println(sum);
		}
	}
}
