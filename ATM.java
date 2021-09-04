import java.util.Scanner;

public class ATM {
    public static void main(String ar[]){
        Scanner i = new Scanner(System.in);
        double amount=120;
        System.out.println("Enter the amount you want to withdraw");
        double input=i.nextDouble();
        double charges=0.5;
        if(input%5==0){
            if(input<amount){
                double withdraw=amount-input-charges;
                System.out.println(String.format("%.2f",withdraw));
            }
            else{
                System.out.println("The amount you want to withdraw is greater than amount in your account");
            }
        }
        else{
            System.out.println("The amount must be in multiple of 5");
        }
    }
}
