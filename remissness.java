import java.util.*;
public class remissness 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int a,b;
        for(int i=0;i<t;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            int min=((a-b)>0?a:b);
		    System.out.println(min+" "+(a+b));
        }
        sc.close();
    }
}
