/* package codechef; // don't place package name! */
import java.util.Scanner;
class Chef_And_Remessis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count= sc.nextInt();
        for(int i=0;i<count;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }
            System.out.println((a+b));
        }
    }
}