import java.util.Scanner;

 class Square_Roots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for(int i=0;i<N;i++){
            int num = scan.nextInt();
            System.out.println((int)Math.sqrt(num));
        }
    }
}