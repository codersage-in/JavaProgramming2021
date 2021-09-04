import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int ev=0,od=0;
     int ar[] = new int[n];
     for(int i=0;i<n;i++)
     {
      ar[i]=sc.nextInt();
      if(ar[i]%2==0)
      {
       ev++;
      }
      else
      {
       od++;
      }
     }
     if(od>=ev)
     {
      System.out.println("NOT READY");
     }
     else
     {
      System.out.println("READY FOR BATTLE");
     }
    }
}