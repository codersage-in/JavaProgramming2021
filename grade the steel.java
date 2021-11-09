import java.util.*;
import java.lang.*;
import java.io.*;


class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0)
	        {
	        int h=sc.nextInt();
	        double c=sc.nextDouble();
	        int te=sc.nextInt();
	        if(h>50&&c<0.7&&te>5600)
	       System.out.println("10");
	        else if(h>50&&c<0.7)
	        System.out.println("9");
	        else if(c<0.7&&te>5600)
	        System.out.println("8");
	        else if(h>50&&te>5600)
	        System.out.println("7");
	        else if(h>50||c<0.7||te>5600)
	        System.out.println("6");
	        else if(!(h>50&&c<0.7&&te>5600))
	        System.out.println("5");
	        }
	    }catch(Exception e)
	    {
	        return;
	    }
	}
}