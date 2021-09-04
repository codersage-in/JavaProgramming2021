import java.util.Scanner;

public class Chef_and_SnackDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int j = 1; j <= count; j++) {
            int a=sc.nextInt();
            if(a==2010||a==2015||a==2016||a==2017||a==2019){
                System.out.println("HOSTED");
            }
            else{
                System.out.println("NOT HOSTED");
            }
        }
    }
}
