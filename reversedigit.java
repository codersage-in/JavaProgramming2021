import java.util.Scanner;
 class ReverseTheNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();

        sc.nextLine();

        int data = 0;

        for (int i = 0; i < loop; i++) {
            data = sc.nextInt();
            int rev=0, rem=0;
            while(data >0){
                rem = data % 10;
                rev = (rev * 10) + rem;
                data = data /10 ;
            }
            System.out.println(rev);
        }

    }
}
