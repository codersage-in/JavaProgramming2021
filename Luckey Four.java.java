import java.util.*;
class CodeChef
{
      public static void main (String[] args) 
     {
          Scanner sc = new Scanner(System.in);
          try {
              int t = sc.nextInt();
              while(t-->0)
              {
                  int num = sc.nextInt();
                  int c = 0,rem;
                  while(num>0)
                  {
                      rem = num%10;
                      if(rem == 4)c++;
                      num=num/10;
                  }
                  System.out.println(c);
              }
              
          } catch(Exception e) {
              return;
          } 
          
          
     }
}