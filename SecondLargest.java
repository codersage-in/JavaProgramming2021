import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A>B && A<C || A<B && B>C){
                System.out.println(A);
            }
            else if(B>A && B<C || B<A && B>C){
                System.out.println(B);
            }
            else{
                System.out.println(C);
            }
        }
    }
}
