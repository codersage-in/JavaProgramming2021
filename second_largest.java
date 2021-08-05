import java.util.*;
public class second_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,A,B,C;
        n=sc.nextInt();
        if(n>=1 && n<=1000){
            for(int i=0;i<n;i++){
                A=sc.nextInt();
                B=sc.nextInt();
                C=sc.nextInt();
                if(A>=1 && B>=1 && C>=1 && A<=1000000 && B<=1000000 && C<=1000000)
                {
                    if(A>B && A<C){
                        System.out.println(A);
                    }
                    else if(A>C && A<B){
                        System.out.println(A);
                    }
                    else if(B>A && B<C){
                        System.out.println(B);
                    }
                    else if(B>C && B<A){
                        System.out.println(B);
                    }
                    else if(C>A && C<B){
                        System.out.println(C);
                    }
                    else{
                        System.out.println(C);
                    }
                }
            }
        }
    }
}
