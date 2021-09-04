import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) 
	    {
	        int a,b,c;
	        Scanner s =new Scanner(System.in);
	        int n=s.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a=s.nextInt();
	            b=s.nextInt();
	            c=a+b;
	            System.out.println(c);
	        }
		}
	}