import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    if(t>=1 && t<=1000){
        for(int i=0;i<t;i++){
            int sum=0;
            int n=sc.nextInt();
            int arr[]={1,2,5,10,50,100};
            for(int j=5;j>=0;j--){
                sum+=(int)n/arr[j];
                n=n%arr[j];
            }
            System.out.println(sum);
        }
    }
	}
}