import java.util.*;
import java.math.BigInteger;

public class CommonFile {
    public static void main(String[] arg){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            BigInteger x = new BigInteger("1");
        for(int i=2; i<=n; i++){
            x = x.multiply(BigInteger.valueOf(i));
        }
        System.out.println(x);
        }
    }
}
