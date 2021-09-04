
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    while(n>0)
	    {
	        n--;
	        int a=s.nextInt(),sum=0;
	        while(a>0)
	        {
	            if(a%10==4)
	            {
	                sum++;
	            }
	            a=a/10;
	        }
	        System.out.println(sum);
	    }
	}
}
