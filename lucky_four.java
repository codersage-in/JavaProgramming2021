mport java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		      t--;
		      int n = sc.nextInt();
		      int count=0,m=0;
		      while(n>0){
		            m=n%10;
		            if(m==4){
		                  count++;
		            }
		            n=n/10;
		      }
		      System.out.println(count);
		}
	}
}
