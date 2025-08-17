import java.util.Scanner;
public class pyramidLoop {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        printFirstPattern(rows);
        printSecondPattern(rows);
    }

    public static void printThirdPattern(int rows){
        
    }


    public static void printSecondPattern(int maxRows){
        System.out.println("\nHere is reverse right half pyramid");
        int rows = maxRows;
        while(rows>0){
            int i = 0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }


    public static void printFirstPattern(int rows){
        System.out.println("\nHere is right half pyramid");
        rows = 0;
        while(rows<5){
            System.out.print("*");
            int i = 0;
            while(i<rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
