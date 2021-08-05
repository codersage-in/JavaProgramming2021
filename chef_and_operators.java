import java.util.*;
public class chef_and_operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,a,b;
        t=sc.nextInt();
        if(t>=1 && t<=10000){
            for(int i=0;i<t;i++){
                a=sc.nextInt();
                b=sc.nextInt();
                if(a>=1 && b>=1 && a<=1000000001 && b<=1000000001){
                    if(a>b){
                        System.out.println(">");
                    }
                    if(a<b){
                        System.out.println("<");
                    }
                    if(a==b){
                        System.out.println("=");
                    }
                }
            }
        }
    }    
}
