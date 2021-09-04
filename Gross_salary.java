package Code_chef;
import java.util.*;
import java.lang.*;
import java.io.*;
class Gross_salary
{
	public static void main (String[] args) throws java.lang.Exception
	{
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
