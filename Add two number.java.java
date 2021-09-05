import java.util.Scanner;
class main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
          int t = sc.nextInt();
            while(t-->0)
            {
              int  a = sc.nextInt();
              int  b = sc.nextInt();
                System.out.println(a+b);
            }
    
            
        } catch(Exception e) {
            return;
        }
        
    }
}