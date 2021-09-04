import java.util.Scanner;

public class Small_Factorial {
    public static void main(String ar[]){
        Scanner i = new Scanner(System.in);
        int num=i.nextInt();
        int a,mul=1;
        for(int m=1;m<=num;m++){
            a=i.nextInt();
            for(int j=1;j<=a;j++){
                mul=mul*j;
            }
            System.out.println(mul);
        }
    }
}
