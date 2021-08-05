import java.util.Scanner;
public class PackagingCupcakes {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int n = in.nextInt() ;
            if(n%2 == 0){
            System.out.println(n);
            }
            else{
                int cupcakes = n - n/2;
                System.out.println(cupcakes);
            }
        }
    }    
}
