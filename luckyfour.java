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
for(int i=1; i<=T ; i++)
{
   int count=0;
   int n = sc.nextInt();
   while(n!=0)
   {
       if((n%10) == 4)
       {
           count++;
       }
       n=n/10;
   }
   System.out.println(count);
}
}
}