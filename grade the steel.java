import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
		      int hard = sc.nextInt();
		      double carbon = sc.nextDouble();
		      int tensile = sc.nextInt();
		      if(hard>50 && carbon<0.7 && tensile > 5600)
		      System.out.println(10);
		      else if(hard>50 && carbon<0.7)
		      System.out.println(9);
		      else if(carbon<0.7 && tensile>5600)
		      System.out.println(8);
		      else if(hard>50 && tensile>5600)
		      System.out.println(7);
		      else if(hard>50 || carbon<0.7  || tensile> 5600)
		      System.out.println(6);
		      else
		      System.out.println(5);
		}
	}
}
