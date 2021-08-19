import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class currency_formatter{

    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        double payment = S.nextDouble();
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat US    = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat India  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat China  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat France = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US="     + US.format(payment));
        System.out.println("India= "  + India.format(payment));
        System.out.println("China= "  + China.format(payment));
        System.out.println("France= " + France.format(payment));
    }
}
