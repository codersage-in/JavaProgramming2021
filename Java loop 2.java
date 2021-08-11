import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        int m;
        int b_total;
         int sum=0;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++, b_total=0,sum=0){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            b_total=a;
            
            for (int j=0;j<n;j++){
                
                b_total=b_total+ (b*((int)Math.pow(2,j)));
                //printing
            System.out.print(b_total+" ");
            }
            System.out.print("\n");
        }
        in.close();
        
        
    }
}
