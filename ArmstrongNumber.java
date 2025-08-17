import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean armstrong = isArmstrong(num);
        if(armstrong){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }
    }

    public static boolean isArmstrong(int num){
        int digits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while(num > 0){
            int lastDigit = num % 10;
            num = num / 10;
            finalNumber = finalNumber + pow(lastDigit, digits);

        }
        return finalNumber == numCopy;
    }


    public static int pow(int num1 , int num2){
        int result = num1;
        int i = 1;
        while(i < num2){
            result = result*num1;
            i++;
        }
        return result;

    }

    public static int noOfDigits(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num = num / 10;
        }
        return digits;
    }
}
