import java.util.Scanner;

public class Primality_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int j = 1; j <= count; j++) {
            int i,m=0,f=0;
            int n=sc.nextInt();
            m=n/2;
            if(n==0||n==1){
                System.out.println(n+" is not prime number");
            }
            else{
                for(i=2;i<=m;i++){
                    if(n%i==0){
                        System.out.println("no");
                        f=1;
                        break;
                    }
                }
                if(f==0)  { System.out.println("yes"); }
            }
        }
    }

}