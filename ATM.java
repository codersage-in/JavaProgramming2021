import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float X;
        float Y;
        X=sc.nextInt();
        Y=sc.nextInt();
        if(Y>(X+0.5) && X%5==0){
            double ans=(Y-(X+0.50));
            System.out.printf("%.2f",ans);
        }
        else{
            System.out.println(Y);
        }
    }
}
