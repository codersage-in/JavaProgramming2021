import java.util.*;
class Note
{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        //int p=0,q=0;

        while(t>0)
        {
            
            t--; 

            int n = s.nextInt();

            int rem=n%100;
            int count=n/100;

            count=count+(rem/50);
             rem=rem%50;
             
             count=count+(rem/10);
             rem=rem%10;
             
             count=count+(rem/5);
             rem=rem%5;
             
             count=count+(rem/2);
             rem=rem%2;
             
             count=count+(rem/1);
             rem=rem%1;
             
            
            System.out.println(count);
        }
}
}