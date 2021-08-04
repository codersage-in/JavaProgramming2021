import java.util.*;
public class Firstandlastdigit{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Given number is: "+ number);
        int firstdigit = 0;
        int lastdigit = 0;
        lastdigit = number % 10;
        System.out.println("Last Digit is: " + lastdigit);
        while(number != 0)
        {
            firstdigit = number % 10;
            number = number / 10;
        }
        System.out.println("First Digit is: " + firstdigit);
    }
}