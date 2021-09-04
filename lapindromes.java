import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
			Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++)
        {
            if(i==0)
            sc.nextLine();
            String s = sc.nextLine();
            String str1="",str2="";

            str1 = s.substring(0,s.length()/2); 
            if(s.length()%2==0)
            {
                 str2 = s.substring(s.length()/2,s.length());
            }
            else
            {
                str2 = s.substring(s.length()/2+1,s.length());
            }
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            if(Arrays.equals(s1,s2))
                System.out.println("YES");
            else
               System.out.println("NO");
        }
	}
}