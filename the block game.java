import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input= new Scanner(System.in);
		int t=input.nextInt();
		for(int i=0;i<t;i++){
		    int n=input.nextInt();
		    int count=0;
		    int temp =n;
		    while(n!=0){
		        count++;
		        n=n/10;
		    }
		    int[] arr = new int[count];
		    for(int j=count-1;j>=0;j--){
		        int rem=temp%10;
		        arr[j]=rem;
		        temp=temp/10;
		    }
		    int count1=0;
		    for(int k=0;k<count;k++){
		        if(arr[k]!=arr[count-k-1])
		        count1++;
		        }
		        if(count1==0)
		        System.out.println("wins");
		        else
		        System.out.println("loses");
		}
	}
}
