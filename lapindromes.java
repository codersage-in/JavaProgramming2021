import java.util.Arrays;
import java.util.Scanner;

  class Lapindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.next();
            int length = s.length();
            String first=" ";
            String second=" ";
            if (length % 2 == 0) {
                  first = s.substring(0,length / 2);
                  second=s.substring((length)/2,length);
              

            }
            else
            {
                first = s.substring(0, (length) / 2);
                second=s.substring((length)/2+1,length);
       
            }

            char[] arr1=first.toCharArray();
            Arrays.sort(arr1);
            char[] arr2=second.toCharArray();
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2))
                 System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}