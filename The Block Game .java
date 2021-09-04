import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int t,number;
        t=sc.nextInt();
        if(t>=1 && t<=20){
            for(int i=0;i<t;i++){
                number=sc.nextInt();
                int numcopy=number,rev=0;
                while(number>0){
                    rev=rev*10 +(number%10);
                    number=number/10;
                }
                if(numcopy==rev){
                    System.out.println("wins");
                }
                else{
                    System.out.println("loses");
                }
            }
        }
	}
}
