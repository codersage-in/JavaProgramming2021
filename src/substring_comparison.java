import java.util.Scanner;

public class substring_comparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for(int i=0;i<=s.length()-k;i++)
        {
            String substring = s.substring(i,i+k);
            if(i==0){
                smallest=substring;
            }
            if(substring.compareTo(largest)>0){
                largest=substring;
            }else if(substring.compareTo(smallest)<0)
                smallest=substring;

        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}