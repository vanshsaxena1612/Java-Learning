import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        int GCD = GCD(first, second);
        System.out.println("The GCD is: " + GCD);
    }

    public static int GCD(int first, int second){
        int GCD = 1;
        int i = 2;
        int least = least(first, second);
        while (i <= least){
            if (first %i == 0 && second %i == 0){
                GCD = i;
            }
            i++;

        }
        return GCD;


    }
    public static int least(int first, int second){
        if(first<second){
            return first;
        }else{
            return second;
        }
    }
}