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
for(int i=1 ; i<=T ; i++)
{
   int N = sc.nextInt();
   int sum = 0;
   while(N != 0 )
   {
       int r100 = N/100;
       sum = sum+ r100;
       N=N%100;
       int r50 = N/50;
       sum = sum+r50;
       N = N%50;
       int r10 = N/10;
       sum = sum+r10;
       N=N%10;
       int r5 = N/5;
       sum = sum+r5;
       N=N%5;
       int r2 = N/2;
       sum = sum+r2;
       N=N%2;
       int r1 = N/1;
       sum = sum+r1;
       N=N%1;
       
   }
   System.out.println(sum);
}
}
}