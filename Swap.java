import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();



        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Swapping is done:  " + num1);
        System.out.println("Swapping is done:  " + num2);
    }
}
