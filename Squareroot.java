import java.util.*;
public class Squareroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,number;
        n=sc.nextInt();
        if(n>=1 && n<=20){
            for(int i=0;i<n;i++){
                number=sc.nextInt();
                if(number>=1 && number<=10000){
                    System.out.println((int)Math.sqrt(number));
                }
            }
        }
    }
}
