
import java.util.*;

import java.lang.*;

import java.io.*;

public class Main

{

	public static void main (String[] args) throws java.lang.Exception
	{

	InputStreamReader r=new InputStreamReader(System.in);    

        BufferedReader br=new BufferedReader(r); 

		int T = Integer.parseInt(br.readLine());

		

		for(int i =0;i<T;i++){

		    int fac = 1;

		    int n = Integer.parseInt(br.readLine());

		    for(int j=n;j>0;--j){

		        fac = fac*n;

		         n = n-1;

		        

		    }

		    System.out.println(fac);

		}

	}

}