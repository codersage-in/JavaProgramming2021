import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc = new Scanner(System.in);
	    int	n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		System.out.println(arr[i]);
	}
}
