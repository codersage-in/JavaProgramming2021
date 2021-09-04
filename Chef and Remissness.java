
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    if (a > b){
		        System.out.println(a + " " + (a + b));
		    } else {
		        System.out.println(b + " " + (a + b));
		    }
		}
	}
}