import java.util.Scanner;

public class TheBlockGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int rev=0,pal=n;
            while(n>0){
                int rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            if(rev==pal)
                System.out.println("wins");
            else
                System.out.println("loses");
        }
        }
    }

