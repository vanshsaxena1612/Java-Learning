import java.util.Scanner;

public class sumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = sumofDigits(num);
        System.out.println("Sum of digits is: " + sum);
    }
    public static int sumofDigits(int num){
        int sum = 0;
        while(num>0){
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
