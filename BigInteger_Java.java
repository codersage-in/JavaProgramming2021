import java.util.*;
import java.math.*;
public class BigInteger_Java
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner (System.in);
        BigInteger a = new BigInteger((S.next()));
        BigInteger b = new BigInteger((S.next()));
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}