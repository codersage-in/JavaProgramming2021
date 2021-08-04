
import java.util.Scanner;

 class App {
    public static void main(String ar[]){
        //Get the input from the user
        Scanner animal =new Scanner(System.in);//creating an object of scanner class
        //lets call the method of scanner
        int noOfInputs=animal.nextInt();//calling the method of the java class
        for(int cnt=0;cnt<noOfInputs;cnt++){
            String data=animal.next();
            int sum=0;
            for(int charcnt=0;charcnt<data.length();charcnt++){
                sum=sum+(data.charAt(charcnt)-'0');
            }
            System.out.println(sum);
        }
    }
}
