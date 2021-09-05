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
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev=0,temp=0;
		for(int i=1;i<=n;i++){
		    rev=0;
		    int x=s.nextInt();
		    while(x!=0){
		        temp=x%10;
		        rev=rev*10+temp;
		        x/=10;
		    }
		    System.out.println(rev);
		}
	}
}
