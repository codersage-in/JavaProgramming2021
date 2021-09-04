import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		try{
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int even=0;
		    int odd=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]%2==0){
		            even++;
		        }else{
		            odd++;
		        }
		    }
		    if(even>odd){
		       System.out.println("READY FOR BATTLE"); 
		    }else{
		        System.out.println("NOT READY");
		    }
		    
		    }catch(Exception e){
		    return;
		}
	}
}