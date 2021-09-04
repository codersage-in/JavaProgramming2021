/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		for(int i=0;i<A;i++)
		{
		   	int D=sc.nextInt();
		   	int N=sc.nextInt();
		   	for(int j=1;j<=D;j++)
		   	{
		   	    int sum=0;
		   	     while(N!=0)
                {
                    sum+=N;
                    N--;
                }
               N=sum;
               
		   	}
            
                 System.out.println(N);
		}
		
	    
	}
}
