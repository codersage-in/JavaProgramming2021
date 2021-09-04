package Code_chef;


import java.util.*;
import java.lang.*;
import java.io.*;
class puppy_and_sum 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		   	int a=sc.nextInt();
		   	int b=sc.nextInt();
		   //	int sum=0;
		   	for(int j=1;j<=a;j++)
		   	{
		   	    int sum=0;
		   	     while(b!=0)
                {
                    sum+=b;
                    b--;
                }
               b=sum;
               
		   	}
            
                 System.out.println(b);
		}
		
	    
	}
}
    

