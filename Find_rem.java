import java.util.*;
public class Find_rem {
    public static void main(String args[]){
        Scanner R = new Scanner(System.in);
        System.out.println("Divident is:");
        int Divident=R.nextInt();
        System.out.println("Divisor is:");
        int Divisor=R.nextInt();
        int Remainder = (Divident % Divisor);


        System.out.println("Remainder is:"+Remainder);
    }
}
