import java.util.Scanner;
public class results{
    public static void main (String[] args){
        System.out.println("Name=Rachit Shah");
        System.out.println("Roll No=20IT133");

        Scanner scan=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Name Of Subject-1:");
        String sub1=sc.nextLine();
        System.out.println("Enter Marks of Subject-1:");
        int marks1=scan.nextInt();
        System.out.println("Enter The Name Of Subject-2:");
        String sub2=sc.nextLine();
        System.out.println("Enter Marks of Subject-2:");
        int marks2=scan.nextInt();
        System.out.println("Enter The Name Of Subject-3:");
        String sub3=sc.nextLine();
        System.out.println("Enter Marks of Subject-3:");
        int marks3=scan.nextInt();
        System.out.println("List Of Sub And Marks Is:");
        System.out.println(sub1);
        System.out.println(marks2);
        System.out.println(sub2);
        System.out.println(marks2);
        System.out.println(sub3);
        System.out.println(marks3);
        System.out.println("The average is:");
        int avj = (marks1+marks2+marks3) / 3;
        System.out.println(avj);


    }
}
