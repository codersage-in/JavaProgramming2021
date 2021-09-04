    import java.util.Scanner;

    public class Remainder {
            public static void main(String ar[]) {
                Scanner i = new Scanner(System.in);
                int count = i.nextInt();
                for (int j = 0; j < count; j++) {
                    int a = i.nextInt();
                    int b = i.nextInt();
                    int c = a % b;
                    System.out.println(c);
                }
            }
    }
