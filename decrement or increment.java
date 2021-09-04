import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
	    int a=sc.nextInt();
	    if(a%4==0)
	    {
	       System.out.println(++a) ;
	    }
	    else
	    {
	        System.out.println(--a);
	    }
	}
}
