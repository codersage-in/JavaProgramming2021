import java.util.*;
public class lead_game
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int sum1=0,sum2=0,max=0;
        int winner=0;
        
        for(int i=1; i<=N; i++) {
            
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            
            sum1 += p1;
            sum2 += p2;
            
            if(sum1>sum2 && (sum1-sum2)>max) {
                    max=sum1-sum2;
                    winner = 1;
            }
            else if(sum2>sum1 && (sum2-sum1)>max) {
                max=sum2-sum1;
                winner = 2;
            }
        }
        System.out.println(winner+" "+max);
        sc.close();
    }
}