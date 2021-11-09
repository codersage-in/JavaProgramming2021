import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int ar[][]=new int[t+1][2];
		int out[]=new int[t+1];
		//Read
		for(int i=0;i<t;i++)
		{
		    ar[i][0]=sc.nextInt();
		    ar[i][1]=sc.nextInt();
		}
		//Process
		for(int i=0;i<t;i++)
		    out[i]=sum(ar[i][0],ar[i][1]);
		//Print
		for(int i=0;i<t;i++)
		    System.out.println(out[i]);
		
	}
	public static int sum(int n)
	{
	    int sum=0;
	    for(int i=1;i<=n;i++)    
	        sum+=i;
	    return sum;
	}
	public static int sum(int d,int n)
	{
	    if(d==1)
	        return sum(n);
	    else
	    return sum(sum(d-1,n));
	}
}
