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
	    if(t>=1 && t<=1000)
	    {
	    for(int i=0;i<t;i++)
	    {
	        int n=sc.nextInt();
	        if(n>=0 && n<=20)
	        {
	            int fact=1;
	            if(n==0)
	            {
	                System.out.println(1);
	            }
	            else{
	                for(int j=1;j<=n;j++)
	            {
	                fact*=j;
	            }
	            System.out.println(fact);
	            }
	            
	        }
	    }
	    }
		// your code goes here
	}
}