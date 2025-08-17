import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the principle amount: ");
        int principle = input.nextInt();
        System.out.println("Please enter the number of years you are borrowing the money: ");
        float years = input.nextFloat();
        System.out.println("Please enter the rate of interest: ");
        float rate = input.nextFloat();

        float interest = (principle * years * rate)/100;
        System.out.println("The interest is: " + interest);

    }
}
