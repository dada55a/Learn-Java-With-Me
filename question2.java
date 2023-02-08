//Write a program to add two numbers by asking the values to user
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println(a+b);

    }
}