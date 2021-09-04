import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    if ((a==b||a==c||a==d)&&(b==a||b==c||b==d)&&(c==a||c==b||c==d)&&(d==a||d==b||d==c))
		    {
		        System.out.println("YES");
		    } 
		    else 
		    {
		        System.out.println("NO");
		    } 
		}
	}
}