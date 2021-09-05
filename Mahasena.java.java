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
int N = sc.nextInt();
int A[] = new int[N];
int lucky =0 , unlucky = 0;
for(int i=0 ; i<N ; i++)
{
   A[i] = sc.nextInt();
   if(A[i]%2 == 0)
   {
       lucky++;
   }
   else
   {
       unlucky++;
   }
}
if(lucky>unlucky)
{
   System.out.println("READY FOR BATTLE");
}
else
{
   System.out.println("NOT READY");
}

}
}