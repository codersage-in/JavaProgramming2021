import java.util.Scanner;
public class Is_it_a_VOWEL_or_CONSONANT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String a=sc.next();
            if(a.compareTo("A")==0||a.compareTo("E")==0||a.compareTo("I")==0||a.compareTo("O")==0||a.compareTo("U")==0){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
    }
}
