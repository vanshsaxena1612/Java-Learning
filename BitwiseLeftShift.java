import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to shift by left shifting");
        int num = sc.nextInt();

        int result = num<<4;
        System.out.println("The result is "+result);

    }
}
