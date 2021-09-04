/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int x,y,z;
		for(int i=0;i<t;i++)
		{
		   x=sc.nextInt();
		   y=sc.nextInt();
		   z=sc.nextInt();
		    if(x>y && x<z || x>z && x<y){
		        System.out.println(x);
		    }else if(y>x && y<z || y>z && y<x){
		        System.out.println(y);
		    }else{
		        System.out.println(z);
		    }
	}
	}
}
