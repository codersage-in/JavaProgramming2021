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
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-- >0){
	        String str1=sc.next();
	        String str2=sc.next();
	        int n=str1.length();
	        int min=0,max=0;
	        for(int i=0;i<n;i++){
	            char a=str1.charAt(i);
	            char b=str2.charAt(i);
	            if(a!='?' && b!='?' && a!=b)
	            {
	                min++;
	                max++;
	            }
	            else if((a=='?' && b!='?') || (a!='?' && b=='?'))
	            max++;
	            else if(a=='?' && b=='?')
	            max++;
	        }
	        System.out.println(min+" "+max);
	    }
	}
}