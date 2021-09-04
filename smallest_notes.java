import java.util.Scanner;
public class smallest_notes 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
        {
		    int a = sc.nextInt();
		    int count = 0;
		    if(a>=100)
            {
		        count += (a/100);
		        a %= 100;
		    }
		     if(a>=50){

		        count += (a/50);
		        a %= 50;
		    }
		     if(a>=10)
            {
		        count += (a/10);
		        a %= 10;
		    }
		     if(a>=5)
            {
		        count += (a/5);
		        a %= 5;
		    } if(a>=2)
            {
		        count += (a/2);
		        a %= 2;
		    }
		     if(a>=1)
            {
		        count += (a/1);
		        a %= 1;
		    }
		    System.out.println(count);
		}
        sc.close();
    }   
}
