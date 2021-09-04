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
		Scanner sc = new Scanner(System.in);
	   int T = sc.nextInt();
	   String[] str = new String[T];
	   for(int i=0;i<T;i++)
	   {
	         str[i] = sc.next();
	   }
	   for(int i=0;i<T;i++){
	         String s1 = "";
	         String s2 = "";
	         boolean flag = true;
	         if(str[i].length()%2 == 0){
	             s1 = str[i].substring(0,str[i].length()/2);
	             s2 = str[i].substring(str[i].length()/2,str[i].length());
	         }
	         else{
	               
	             s1 = str[i].substring(0,str[i].length()/2);
	             s2 = str[i].substring(str[i].length()/2+1,str[i].length());
	         }
	         char[] ch1 = s1.toCharArray();
	         char[] ch2 = s2.toCharArray();
	         Arrays.sort(ch1);
	         Arrays.sort(ch2);
	         for(int v1 = 0;v1<ch1.length;v1++)
	         if(ch1[v1] != ch2[v1])
	         flag = false;
	         if(flag)
	         System.out.println("YES");
	         else
	         System.out.println("NO");
	   }
	}
}
