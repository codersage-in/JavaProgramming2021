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

while(num-->0){
   int a = sc.nextInt();
   int b = sc.nextInt();
       int sum=0;
       
   while(a-->0){
       sum = (b*(b+1))/2;
       b=sum;
   }
   System.out.println(sum);
}
}
}
