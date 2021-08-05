import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int max = a>b ? a>c ? a : c : b>c ? b : c;
            int secondmax = 0;
            if(a == max){
                secondmax = b>c ? b : c;
            }
            else if(b == max){
                secondmax = a>c ? a : c;
            }
            else{
                secondmax = a>b ? a : b;
            }
            System.out.println(secondmax);
        }
    }    
}
