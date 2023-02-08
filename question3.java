//write a program to enter to find area of circle
import java.util.Scanner;
public class question3 {

    public static void main(String[] args) {
        double r, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        r = sc.nextInt();
        area = 3.14*r*r;
        System.out.println(area);
    }
}