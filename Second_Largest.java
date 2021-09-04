package Code_chef;
import java.util.*;

public class Second_Largest {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();

            if((b>a && a>c) || (b<a && a<c)){
                System.out.println(a);
            }
            else if((a>b && b>c) || (a<b && b<c)){
                System.out.println(b);
            }
            else if((a>c && c>b) || (a<c && c<b)){
                System.out.println(c);
        }
    }
}
}
