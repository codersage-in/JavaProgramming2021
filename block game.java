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
int n = sc.nextInt();
for(int i=1 ; i<=n ; i++)
{
   int x = sc.nextInt();
   int num = x;
   int rev = 0;
   while(x!= 0 )
   {
       int rem = x%10;
       rev = rev*10 + rem;
       x= x/10;
   }
   if(num == rev)
   {
       System.out.println("wins");
   }
   else
   {
       System.out.println("loses");
   }
	}
}
