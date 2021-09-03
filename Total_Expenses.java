import java.util.*;
import java.lang.*;


    /* Name of the class has to be "Main" only if the class is public. */
    class Total_Expenses
    {
        public static void main (String[] args) throws java.lang.Exception
        {
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
                    // System.out.printf("%.6f\n", finalbill);
                }
                else{
                    System.out.println(bill);
                    // System.out.printf("%.6f\n", bill);
                }
            }
        }
    }

