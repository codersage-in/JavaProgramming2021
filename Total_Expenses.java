import java.util.Scanner;

public class Total_Expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int j = 1; j <= count; j++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans=0;
            if(a>1000){
                int temp=(a*b)/10;
                ans=(a*b)-temp;
            }
            else{
                ans=(a*b);
            }
            System.out.println(ans);
        }
    }
}
