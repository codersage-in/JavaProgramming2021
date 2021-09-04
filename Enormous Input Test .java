import java.util.Scanner;

class Enormous_Input_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int count = 0;

        for(int i=0;i<n;i++){
            int x = input.nextInt();
            if(x%k == 0){
                count++;
            }
        }
        System.out.println(count);
    }
};