import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int first = readnumber();
        int second = readnumber();

        int sum = first + second;
        System.out.println("The sum is: " + sum);

    }

    public static int readnumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();
        return number;
    }
}
