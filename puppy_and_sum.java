import java.util.*;
public class puppy_and_sum 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		   	int d=sc.nextInt();
		   	int n=sc.nextInt();
		   	
		   	for(int j=1;j<=d;j++)
		   	{
		   	    int sum=0;
		   	     while(n!=0)
                {
                    sum+=n;
                    n--;
                }
               n=sum;
               
		   	}
            
                 System.out.println(n);
                 sc.close();
		}
    }
    
}
