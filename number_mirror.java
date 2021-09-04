import java.util.*;
import java.lang.*;
import java.io.*;


class number_mirror
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int reverse=0;
		int a=sc.nextInt();
        while(a != 0)   
    {  
        int remainder = a % 10;  
        reverse = reverse * 10 + remainder;  
        a = a/10;  
    }  
	System.out.println(reverse);
	}
}
