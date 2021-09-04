import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double withdraw=sc.nextDouble(),acc_bal=sc.nextDouble();
        if(withdraw%5==0 && withdraw<=(acc_bal-0.50)){
            acc_bal=acc_bal - (withdraw+0.50);
            System.out.printf("%.2f",acc_bal);
        }
        else{
            System.out.printf("%.2f",acc_bal);
        }
    }
}
