import java.util.*;
public class reverse {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n!=0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        sc.close();
        System.out.println(rev);
    }
    }

