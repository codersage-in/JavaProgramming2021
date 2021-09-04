import java.util.*;

public class Add_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,A,B,sum;
        n=sc.nextInt();
        if(n>=1 && n<=1000){
            for(int i=0;i<n;i++){
                sum=0;
                A=sc.nextInt();
                B=sc.nextInt();
                if(A>=0 && B>=0 && A<=10000 && B<=10000){
                    sum=sum+A+B;
                }
                System.out.println(sum);
            }
        }
    }
}
