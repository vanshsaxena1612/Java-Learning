import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int add = a + b;
        System.out.println("The sum is " + add);
        int sub = a - b;
        System.out.println("The subtraction  is " + sub);
        int mul = a * b;
        System.out.println("The multiplication is " + mul);
        int div = a / b;
        System.out.println("The division is " + div);
        int mod = a%b;
        System.out.println("The remainder is " + mod);
    }
}
