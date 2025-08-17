import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR PERCENTAGE:  ");
        float percentage = sc.nextFloat();
        if (percentage > 90) {
            System.out.println("GRADE A");
        } else if (percentage > 60) {
            System.out.println("GRADE B");
        }  else if (percentage > 40) {
            System.out.println("GRADE C");
        } else   {
            System.out.println("GRADE D");
        }
    }
}
