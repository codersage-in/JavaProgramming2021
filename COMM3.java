import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int dist = sc.nextInt();
            int [] chef = new int[2],headServer = new int[2],sousChef = new int[2];

            // Below are the coordinates of chef
            chef[0] = sc.nextInt();
            chef[1] = sc.nextInt();
            // Below are the coordinates of headserver
            headServer[0] = sc.nextInt();
            headServer[1] = sc.nextInt();
            // Below are the coordinates of souschef
            sousChef[0] = sc.nextInt();
            sousChef[1] = sc.nextInt();
            
// DIstance between Chef  and Headserver
            int DistFromChef_HeadServer = (int)(Math.pow((headServer[0] - chef[0]),2)+Math.pow((headServer[1] - chef[1]),2));
// DIstance between sousChef  and Headserver
            int DistFromHeadServer_SousChef = (int)(Math.pow((sousChef[0] - headServer[0]),2)+Math.pow((sousChef[1] - headServer[1]),2));
// DIstance between Chef  and souschef            
            int DistFromChef_SousChef = (int)(Math.pow((sousChef[0] - chef[0]),2)+Math.pow((sousChef[1] - chef[1]),2));

//This condition states that both souschef and headserver are in range with the chef
            if(DistFromChef_HeadServer <= (int)Math.pow(dist,2) && DistFromChef_SousChef <= (int)Math.pow(dist,2)){
                System.out.println("yes");
            }
//This condition states that souschef is in range of chef and headserver is in range of souschef but not in range with chef
            else if(DistFromChef_HeadServer > (int)Math.pow(dist,2) && DistFromHeadServer_SousChef <= (int)Math.pow(dist,2)){
                System.out.println("yes");
            }
//This condition states that headserver is in range of chef and souschef is in range of headserver but  not in range with chef
            else if(DistFromChef_SousChef > (int)Math.pow(dist,2) && DistFromHeadServer_SousChef <= (int)Math.pow(dist,2)){
                           System.out.println("yes");
            }
// Here even if one of them is close range with chef but the other one is not in range with both of them or both are out of range with chef
            else{
                System.out.println("no");
            }
            
        }
    }
}
