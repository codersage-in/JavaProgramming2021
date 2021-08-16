import java.util.*;
public class Chef_And_Remissness {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        for(;t>0;t--)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            if(a>b)System.out.println(""+a+" "+(a+b));
            else System.out.println(""+b+" "+(a+b));
         
        }
    }
}
