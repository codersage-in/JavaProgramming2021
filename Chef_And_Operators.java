import java.util.Scanner;
public class Chef_And_Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count= sc.nextInt();
        for(int i=0;i<count;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                System.out.println(">");
            }
            else if(a<b){
                System.out.println("<");
            }
            else{
                System.out.println("=");
            }
        }
    }
}
