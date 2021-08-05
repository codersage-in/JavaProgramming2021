import java.util.Scanner;
public class PackagingCupcakes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int a = input.nextInt();
            System.out.println((a/2)+1);
        }
    }
}
