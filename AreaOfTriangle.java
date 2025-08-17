import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the base in cms: ");
        double b = sc.nextDouble();
        System.out.println("Please enter the height in cms: ");
        double h = sc.nextDouble();
        double area = 0.5 * b * h;
        System.out.println("The area is " + area);
    }
}
