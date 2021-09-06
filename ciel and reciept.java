import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++){
		      int count = 0;
		      int a = sc.nextInt();
		      while(a != 0){
		            if(a >= 2048)
		            a = a-2048;
		            else if(a>=1024)
		            a = a-1024;
		            else if(a>=512)
		            a = a-512;
		            else if(a>=256)
		            a = a-256;
		            else if(a>=128)
		            a = a-128;
		            else if(a>=64)
		            a = a-64;
		            else if(a>=32)
		            a= a-32;
		            else if(a>=16)
		            a = a-16;
		            else if(a>=8)
		            a = a-8;
		            else if(a>=4)
		            a = a-4;
		            else if(a>=2)
		            a = a-2;
		            else if(a>=1)
		            a = a-1;
		            count++;
		      }
		      System.out.println(count);
		}
	}
}
