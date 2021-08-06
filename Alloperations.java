import java.util.*;
public class Alloperations
{
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        System.out.println("A=");
        int A = S.nextInt();
        System.out.println("B=");
        int B = S.nextInt();
        int Addition = A + B;
        System.out.println("Sum=" + Addition);
        int Substraction = A - B;
        System.out.println("Difference=" + Substraction);
        int Multiplication = A * B;
        System.out.println("Multiplication=" + Multiplication);
        int Division = A / B;
        System.out.println("Division=" + Division);
    }
    }