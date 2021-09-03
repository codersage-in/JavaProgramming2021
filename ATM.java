import java.util.*;
import java.lang.*;



    class ATM
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scan = new Scanner(System.in);
            int cash = scan.nextInt();
            double total = scan.nextDouble();

            if (cash % 5 == 0 && total-cash>=0.5) {
                total = (total - cash - 0.50);
                System.out.printf("%.2f", total);
            }
            else{
                System.out.printf("%.2f", total);
            }
        }
    }


