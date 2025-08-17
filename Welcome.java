import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome " + name);
    }
}
