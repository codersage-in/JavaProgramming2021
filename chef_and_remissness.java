import java.util.*;
public class chef_and_remissness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,a,b;
        t=sc.nextInt();
        if(t>=1 && t<=1000){
            for(int i=0;i<t;i++){
                a=sc.nextInt();
                b=sc.nextInt();
                if(a>=0 && b>=0 && a<=1000000 && b<=1000000){
                    if(a<b){
                        System.out.println(b+" "+(a+b));
                    }
                    else{
                        System.out.println(a+" "+(a+b));
                    }
                }
            }
        }
    }
}
