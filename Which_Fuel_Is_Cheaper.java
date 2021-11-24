package JavaProgramming2021;

import java.util.Scanner;

public class Which_Fuel_Is_Cheaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int currentP = sc.nextInt(), currentD = sc.nextInt();
            int incP = sc.nextInt(), incD = sc.nextInt();
            int monthK = sc.nextInt();

            for(int i=0;i<monthK;i++){
                currentP += incP;
                currentD += incD;
            }

            if(currentP > currentD){
                System.out.println("DIESEL");
            }
            else if(currentP < currentD){
                System.out.println("PETROL");
            }
            else{
                System.out.println("SAME PRICE");
            }
        }
        sc.close();
    }
}
