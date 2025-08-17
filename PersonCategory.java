import java.util.Scanner;

public class PersonCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = sc.nextInt();

        if(age>=60){
            System.out.println("You are a senior");
        }else if (age<60){
            System.out.println("You are an adult");
        }else if (age>=13){
            System.out.println("You are a teenager");
        }else{
            System.out.println("You are a child");
        }

    }
}
