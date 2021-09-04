/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  for(int i=0;i<a;i++)
	  {
	      float b=sc.nextInt();
	      float HRA =0;
	      float DA=0;
	      if(b<1500)
	      {
	          HRA = (10*b)/100;
	          DA = (90*b)/100;
	      }
	      else
	      {
	      if(b>=1500)
	       {
	          HRA = 500;
	          DA = (98*b)/100;
	      }
	      
	      }
	      System.out.println(b+HRA+DA);
	  }
	}
}
