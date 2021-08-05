/* package codechef; // don't place package name! */

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
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
		    int[] arr = new int[4];
		    arr[0] = sc.nextInt();
		    arr[1] = sc.nextInt();
		    arr[2] = sc.nextInt();
		    int g = 0,s = 0;
		    int temp=0;
		    for(int x = 0; x<3; x++){
		    for(int j = 1; j<3-x; j++){
		        if(arr[j-1]>arr[j]){
		            temp=arr[j-1];
		            arr[j-1]=arr[j];
		            arr[j]=temp;
		        }
		    }
		    }
		    System.out.println(arr[1]);
		}
	}
}