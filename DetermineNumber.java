import java.util.Scanner;

public class DetermineNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = sc.nextInt();

        if(number > 0){
            System.out.println("Your number is positive: ");
        }else if (number == 0){
            System.out.println("Your number is zero: ");
        }else{
            System.out.println("Your number is negative: ");
        }

    }
}
