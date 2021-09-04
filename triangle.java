import java.util.*;
public class triangle
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length:");
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
          int a1=sc.nextInt();
          int a2=sc.nextInt();
          int a3=sc.nextInt();
          int a4=a1+a2+a3;
          if(a4==180)
          {
              System.out.println("YES");
          }
          else
          {
            System.out.println("NO");
          }
      }
      sc.close();
    }
}