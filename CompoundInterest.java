import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the principle amount: ");
        int p = sc.nextInt();
        System.out.println("Please enter the rate of interest: ");
        float r = sc.nextFloat();
        System.out.println("Please enter for how many years are you borrowing the money: ");
        float t = sc.nextFloat();

        double compInt = p*Math.pow((1+r/100),t);
        System.out.println("The Compound Interest is " + compInt);
    }
}
