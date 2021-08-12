package JavaProgramming2021;

import java.util.Scanner;

public class Total_Expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int Quantity = sc.nextInt();
            int Price = sc.nextInt();
            int  bill = (Quantity*Price);

            if(Quantity >= 1000){
                double discount = bill*0.1;
                double finalbill = bill - discount;
                System.out.println(finalbill);
            }
            else{
                System.out.println(bill);
            }
        }
    }
}
