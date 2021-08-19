import java.util.Scanner;

public class GradeTheSteel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int hardness;
        float carbon;
        int tensile;
        for(int i=0;i<t;i++)
        {
        hardness=sc.nextInt();
        carbon=sc.nextFloat();
        tensile=sc.nextInt();
        if(hardness>50 && carbon<0.7 && tensile>5600)
        {
            System.out.println("10");
        }
        else if(hardness>50 && carbon<0.7)
        {
            System.out.println("9");
        }
        else if(carbon<0.7 && tensile>5600)
        {
            System.out.println("8");
        }
        else if(hardness>50 && tensile>5600 )
        {
            System.out.println("7");
        }
        else if(hardness>50 || carbon<0.7 || tensile>5600 )
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
        }
    }
}
