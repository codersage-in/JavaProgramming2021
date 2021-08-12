import java.util.*;
import java.io.*;

public class Loop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q,a,b,n,sum,sum1,mul;
        q=sc.nextInt();
        if(q>=0 && q<=500){
            for(int i=0;i<q;i++){
                a=sc.nextInt();
                b=sc.nextInt();
                n=sc.nextInt();

                if(a>=0 && b>=0 && a<=50 && b<=50 && n>=1 && n<=15){
                    for(int j=0;j<n;j++){
                        sum1=0;
                        sum1=sum1+a;
                        sum=0;

                        for(int k=0;k<=j;k++){

                            mul=1;
                            mul=mul*b*(int)(Math.pow(2,k));
                            //System.out.print(mul+" ");
                            sum=sum+mul;
                            //System.out.print(sum+" ");
                        }

                        System.out.print(sum+a+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

