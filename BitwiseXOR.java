import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = sc.nextInt();

        int result = num1^num2;
        System.out.println("The result is: "+result);

    }
}
