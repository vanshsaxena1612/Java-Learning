import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num = sc.nextInt();

        int result = ~num;
        System.out.println("The result is "+result);
    }
}
