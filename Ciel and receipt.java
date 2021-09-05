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
int num = sc.nextInt();
while(num-->0)
{
   int p = sc.nextInt();
   int max = 2048;
   int count = 0;
   while(max>0)
   {
       count = count + (p/max);
       p = p%max;
       max = max/2;
   }
   System.out.println(count);
}
}
}
