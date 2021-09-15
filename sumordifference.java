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
int N1 = sc.nextInt();
int N2 = sc.nextInt();
if(N1>N2)
{
   System.out.println(N1 - N2);
}
else
{
   System.out.println(N1 + N2);
}
}
}