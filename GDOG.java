
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
	        Scanner sc=new Scanner(System.in);
	        int tcases=sc.nextInt();
	        while(tcases-->0){
	            int n=sc.nextInt();
	            int k=sc.nextInt();
	            int a=0;
	            for(int i=1;i<=k;i++)
		        {
		            if(n%i>a){
		                a=n%i;
		            }
		        }
	            System.out.println(a);
	        }
	    } catch(Exception e) {
	    }
	}
}