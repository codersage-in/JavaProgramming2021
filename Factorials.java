import java.util.Scanner;
public class Factorials {
    // Scanner in = new Scanner(System.in);
   
    static int factorial(int n){
        int fact = 1;
        while(n >= 1){
            fact *= n;
            n--;
        }
        return fact;
    }
    public static void main(String[] arg){
    Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(factorial(n));
    }  
}
