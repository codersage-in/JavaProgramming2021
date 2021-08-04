import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int num1,num2;
        for(int i=0;i<n;i++){
            num1=sc.nextInt();
            num2=sc.nextInt();
            int rem=num1%num2;
            System.out.println(rem);
        }

    }
    
}
