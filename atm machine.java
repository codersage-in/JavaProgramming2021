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
		while(T-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    String s="";
		    int[]arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		       
		            if(arr[i]<=k &&k>0){
		               k=k-arr[i]; 
		               s=s+"1";
		            }
		            else s=s+"0";
		        
		    }
		    System.out.println(s);
		    
		    
		    
		}
	}
}