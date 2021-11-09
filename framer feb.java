import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = x+y+1;
            while(p<Integer.MAX_VALUE)
            {
                boolean r = false;
                for(int j=2; j<p;j++)
                {
                    if(p%j==0)
                    {
                        r= true;
                        break;
                    }
                }
                if(r==false)
                {
                    break;
                }
                p++;
            }
            
            System.out.println(p-(x+y));
        }
	}
}