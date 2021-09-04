import java.util.Scanner;
public class Chef_and_Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int j = 1; j <= count; j++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int temp=0;
            if(a==b){
                System.out.println("0");
            }
            else if(a>b){
                temp=a-b;
                if(temp<=c){
                    System.out.println("0");
                }
                else{
                    System.out.println((temp-c));
                }
            }
            else if(b>a){
                temp=b-a;
                if(temp<=c){
                    System.out.println("0");
                }
                else{
                    System.out.println((temp-c));
                }
            }
            else{}
        }
    }
}
