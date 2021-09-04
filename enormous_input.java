import java.util.*;
public class enormous_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),number=sc.nextInt(),n;
        int cnt=0;
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            if(n%number==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
