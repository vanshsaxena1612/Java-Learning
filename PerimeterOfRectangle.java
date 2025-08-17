import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Please enter the third number: ");
        int c = sc.nextInt();
        System.out.println("Please enter the fourth number: ");
        int d = sc.nextInt();
        int perimeter = a+b+c+d;
        System.out.println("The perimeter is " + perimeter);
    }
}
