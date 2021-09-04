import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
            int l=sc.nextInt();
            int b=sc.nextInt();
            if((l*b)>(2*(l+b))){
                System.out.println("Area");
                System.out.println(l*b);
            }
            else if((l*b)<(2*(l+b)))
            {
                System.out.println("Peri");
                System.out.println(2*(l+b));
            }
            else if((l*b)==(2*(l+b))){
                System.out.println("Eq");
                System.out.println(l*b);
            }
            else{}
	}
}