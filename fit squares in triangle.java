import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++)
		{
		    int a = sc.nextInt();
		    int count = 0;
		    while(a>2){
		        count += (a-2)/2;
		        a -= 2;
		    }
		    
		    System.out.println(count);
		    
		}
	}
}
