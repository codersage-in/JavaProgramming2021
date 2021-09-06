import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   for(int i=0;i<t;i++)
	   {
	       int a = sc.nextInt();
	       int ld = a%10;
	       int fd =0;
	       while(a!=0)
	       {
	           fd = a%10;
	           a = a/10;
	       }
	        System.out.println(fd + ld);
	      
	   }
	}
}
