import java.util.Scanner;
public class Gross_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int j = 1; j <= count; j++) {
            float a=sc.nextFloat();
            float HRA=0,DA=0;
            float gross=0;
            if(a<1500){
                HRA=a/10;
                DA=(a*90)/100;
                gross=a+HRA+DA;
            }
            else if(a>=1500){
                HRA=500;
                DA=(a*98)/100;
                gross=a+HRA+DA;
            }
            System.out.println(gross);
        }
    }
}
