package Code_chef;

 import java.util.*;
import java.lang.*;
import java.io.*;
class  chef_and_remissness 
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    if(a<b)
	    {
	    System.out.println(b+ " "+(a+b));
	    }
	    else
	    {
	      System.out.println(a+" "+(a+b));  
	    }
	    
    	}
	}
}