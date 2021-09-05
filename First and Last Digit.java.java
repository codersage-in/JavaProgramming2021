/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	try {
	    int t = sc.nextInt();
	    while(t!=0)
	   {
	       int num = sc.nextInt();
	       int first,last,sum;
	       last = num%10;
	       while(num >= 10)
	       {
	           num = num/10;
	       }
	       first = num;
	       sum = first+last;
	       System.out.println(sum);
	       t--;
	   }
	    
	    
	    
	    
	    
	} catch(Exception e) {
	    return;
          	} 
		}
	}

