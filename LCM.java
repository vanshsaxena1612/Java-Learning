import java.util.Scanner;

class LCM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int first = sc.nextInt();
        System.out.println("Enter the number: ");
        int second = sc.nextInt();
        int sum = LCM(first, second);
        System.out.println("The sum is: " + sum);
    }
    public static int LCM(int first, int second){
        int i = 1;
        while(i<=second){
            int factor = first*i;
            if(factor%second==0){
                return factor;

            }
            i++;

        }
        return 0;
    }
}
