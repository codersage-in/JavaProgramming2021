import java.util.*;
public class Mahasena {
    public static void main(String arr[]){
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        int n=t;
        int cnt_even=0;
        while(t-- > 0)
        {
            int a=s.nextInt();
            if(a%2==0)
            cnt_even++;
        }
        if(cnt_even > (n-cnt_even))
        System.out.println("READY FOR BATTLE");
        else
        System.out.println("NOT READY");
    }
}
