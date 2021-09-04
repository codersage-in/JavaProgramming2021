
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s =new Scanner(System.in);
        int l=s.nextInt();
        int b=s.nextInt();
        int area=l*b;
        int perimeter=2*(l+b);
        if(area>perimeter)
        {
            System.out.println("Area");
            System.out.println(area);
        }
        else if(perimeter>area)
        {
            System.out.println("Peri");
            System.out.println(perimeter);
        }
        else
        {
            System.out.println("Eq");
            System.out.println(area);
        }
	}
}
