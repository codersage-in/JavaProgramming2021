/* package codechef; // don't place package name! */

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
		while(t-->0)
		{
		    int quan=sc.nextInt();
		    int price=sc.nextInt();
		    
		    System.out.println(String.format("%.6f",findDis(quan,price)));
		}
	}
	static double findDis(int quan,int price)
	{
	    if(quan>1000)
	    {
	       return (price-price*0.1)*quan;
	    }
	    else
	    return quan*price;
	}

}