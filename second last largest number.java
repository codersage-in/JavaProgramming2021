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
          int n= s.nextInt();
          for(int i=0;i<n;i++){
             int a=s.nextInt();
             int b=s.nextInt();
             int c=s.nextInt();
              if ((b > a && b > c && a > c) || (c > a && a > b && a > b)) {
                  System.out.println(a);
              }
              if ((a > b && a > c && b > c) || (c > b && b > a && c > a)) {
                  System.out.println(b);
              }
              if ((b > c && c > a && b > a) || (a > c && c > b && a > b)) {
                  System.out.println(c);
              }
          }
		
	}
}