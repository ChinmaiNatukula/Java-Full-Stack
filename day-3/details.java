package scanner;
import java.util.Scanner;
public class details {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("enter your salary");
        double salary=sc.nextDouble();
        System.out.println("enter your gender");
        char gender=sc.next().charAt(0);
        System.out.println("enter your college name");
        String college=sc.next();
        System.out.println("name is "+name+" age is "+age+" salary is "+salary +" gender is "+gender+" college is "+college);
    }
}