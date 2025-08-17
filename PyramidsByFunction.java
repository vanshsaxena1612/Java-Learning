public class PyramidsByFunction {
    public static void main(String[] args) {
        printFirstPattern();
        printSecondPattern();

    }

    public static void printFirstPattern(){
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * * ");
    }

    public static void printSecondPattern(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}
