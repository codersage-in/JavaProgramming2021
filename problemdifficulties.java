import java.util.*;
public class problemdifficulties 
{
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length");
        int n=sc.nextInt();
        if(n>=1 && n<1000)
        {
            for(int i=0;i<n;i++)
            {
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                int a3=sc.nextInt();
                int a4=sc.nextInt();
                if((a1>=1 && a1<=10) && (a2>=1 && a2<=10) && (a3>=1 && a3<=10) && (a1>=1 && a4<=10))
                {
                    if(a1==a2 && a1==a3 && a1==a4)
                {
                    System.out.println("0");
                }
                else if(a1==a2 && a1==a3 && a1!=a4)
                {
                    System.out.println("1");
                }
                else if(a2==a3 && a2==a4)
                {
                    System.out.println("1");
                }
                else if(a1==a3 && a1==a4)
                {
                    System.out.println("1");
                }
                else if(a1!=a2 && a1!=a3 && a1!=a4)
                {
                    System.out.println("2");
                }
                }
            }
        }
        sc.close();   
    }
    
}
