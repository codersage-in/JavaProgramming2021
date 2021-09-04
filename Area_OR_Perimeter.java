import java.util.Scanner;
public class Area_OR_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            if((a*b)>(2*(a+b))){
                System.out.println("Area");
                System.out.println(a*b);
            }
            else if((a*b)<(2*(a+b))){
                System.out.println("Peri");
                System.out.println(2*(a+b));
            }
            else if((a*b)==(2*(a+b))){
                System.out.println("Eq");
                System.out.println(a*b);
            }
            else{}
    }
}
