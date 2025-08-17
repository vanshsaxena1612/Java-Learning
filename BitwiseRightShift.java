import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to shift by Right shifting");
        int num = sc.nextInt();

        int result = num>>4;
        System.out.println("The result is "+result);
    }
}
