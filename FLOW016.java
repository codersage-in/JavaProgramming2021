import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int i;
		for(i=0;i<T;i++)
		{
		    long a=sc.nextLong();
		    long b=sc.nextLong();
		    long a1,b1;a1=a;b1=b;long k;
		    if(a1>b1)
		    {
		        while(b1>0)
		        {
		            k=a1%b1;
		            a1=b1;
		            b1=k;
		        }b1=a1*(a/a1)*(b/a1);System.out.println(a1+" "+b1);
		    }
		    else
		    { while(a1>0)
		        {
		            k=b1%a1;
		            b1=a1;
		            a1=k;
		        }
		        a1=b1*(a/b1)*(b/b1);System.out.println(b1+" "+a1);
		    }
		}
	}
}