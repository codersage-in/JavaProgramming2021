import java.util.*;
public class sum_or_diffrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1>=-1000 && n1<=1000 && n2>=-1000 && n2<=1000){
            if(n1>n2){
                System.out.println(n1-n2);
            }
            else{
                System.out.println(n1+n2);
            }
        }
    }
}
