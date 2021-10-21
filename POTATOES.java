import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = x+y+1;
            while(p<Integer.MAX_VALUE)
            {
                boolean r = false;
                for(int j=2; j<p;j++)
                {
                    if(p%j==0)
                    {
                        r= true;
                        break;
                    }
                }
                if(r==false)
                {
                    break;
                }
                p++;
            }
            
            System.out.println(p-(x+y));
        }
        
        
    }
}