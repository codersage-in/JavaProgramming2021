import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int step=0;
            for(int i=11;i>=0;i--){
               double Cpow = Math.pow(2,i);
                while(a>=Cpow){
                    a -= Cpow;
                    step += 1;
                }
            }
            System.out.println(step);
        }
        
	}
}
