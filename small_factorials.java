import java.util.*;
public class small_factorials{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt(),number;
    try {
      for(int i=0;i<t;i++){
        number=sc.nextInt();
        int fact=1;
        for(int j=1;j<=number;j++){
          fact*=j;
        }
        System.out.println(fact);
      }
    } catch (Exception e) {
      return;
    }
  }
}