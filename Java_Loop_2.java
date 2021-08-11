import java.util.*;
public class Java_Loop_2 {
    public static void main(String arr[])
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             int result=a;
        for(int x=1;x<=n;x++)
        {
             result+=b*Math.pow(2,x-1);
             System.out.printf("%s ",result);
        }
         System.out.println();
        }
        in.close();
    }
}
