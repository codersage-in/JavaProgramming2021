import java.util.*;
public class lead_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),player1,player2,sum_of_player1=0,sum_of_player2=0;
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<t;i++){
            player1=sc.nextInt();
            player2=sc.nextInt();
            if(player1>player2){
                arr1.add(player1-player2);
                sum_of_player1=sum_of_player1+(player1-player2);
            }
            else{
                arr2.add(player2-player1);
                sum_of_player1=sum_of_player1+(player2-player1);
            }
        }
        Collections.sort(arr1);
        Collections.sort(arr2);
        if(sum_of_player1>sum_of_player2){
            System.out.println("1"+" "+arr1.get(arr1.size()-1));
        }
        else{
            System.out.println("1"+" "+arr2.get(arr2.size()-1));
        }
    }
}
