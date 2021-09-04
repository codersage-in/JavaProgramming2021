import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    int t=sc.nextInt();
		    int l=t%10;
		    while(t>0)
		    {
		        
		        if(t<10 && t!=0)
		            {break;}
		        t/=10;
		    }
		    sum=l+t;
		    System.out.println(sum);
		    sum=0;
		}
	}
}

